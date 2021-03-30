<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/29/2020
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>

<c:url var="saveUser" value="/rest/public/signup"/>
<c:url var="saveUser" value="/logout"/>
            <div class="modal fade" id="loginModal" tabindex="-1" roleEntity="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog" roleEntity="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="myModalLabel">Login form</h4>
                        </div>
                        <form method="post" action="/rest/public/perform_login" >
                        <div class="modal-body">

                                <div class="form-group">
                                    <label for="username">Email/Username</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <input type="text" class="form-control" id="username" name="username" placeholder="Email/Username">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    </div>
                                </div>
                        </div>
                            <input type="hidden"
                                   name="${_csrf.parameterName}"
                                   value="${_csrf.token}"/>
                            <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <input type="submit" class="btn btn-primary"/>
                        </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="registrationModal" tabindex="-1" roleEntity="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog" roleEntity="document">
                    <div class="modal-content">
                        <div class="modal-header" style="background-color: yellow;">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="registrationModalLabel">Please tell us who you are!</h4>
                        </div>
                        <div class="modal-body">
                                <div class="form-group">
                                    <div id="pb-modalreglog-progressbar"></div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6">
                                        <label class="control-label">First name</label>
                                        <input type="text" name = "firstName" id="firstName" class="form-control" placeholder="First name"/>
                                    </div>
                                    <div class="col-lg-6">
                                        <label class="control-label">Last name</label>
                                        <input type="text" name = "lastName" id="lastName" class="form-control" placeholder="Last name"/>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6">
                                        <label class="control-label">Email</label>
                                        <input type="email" name = "emailRegistration" id="emailRegistration" class="form-control" placeholder="Email"/>
                                    </div>
                                    <div class="col-lg-6">
                                        <label class="control-label">mobile</label>
                                        <input type="text" name = "mobile" id="mobile" class="form-control" placeholder="mobile"/>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6">
                                        <label class="control-label">Address</label>
                                        <input type="email" name = "address" id="address" class="form-control" placeholder="Address"/>
                                    </div>
                                    <div class="col-lg-6">
                                        <label class="control-label">Country</label>
                                        <input type="text" name = "country" id="country" class="form-control" placeholder="Country"/>
                                    </div>
                                </div>
                                <div class="row form-group">
                                    <div class="col-lg-6">
                                        <label class="control-label">Password</label>
                                        <input type="password" name = "password" id="registrationPassword" class="form-control" placeholder="Password"/>
                                    </div>
                                    <div class="col-lg-6">
                                        <label class="control-label">Account type</label>
                                        <select id="role" name="role" class="form-control">
                                            <option value="">Select account type</option>
                                            <option value="ADMIN">Admin</option>
                                            <option value="USER">User</option>
                                        </select>
                                    </div>
                                </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                            <button type="button" class="btn btn-primary" onclick="submit()">Submit</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

<script>
    function closeModal(){
        $('#registrationModal').modal('hide');
        $('#loginModal').modal('hide');
    }
    function showModal(){
        $('#registrationModal').modal('toggle');
    }
    function showLoginForm(){
        $('#loginModal').modal('toggle');
    }

    function submit(){

        var formData ={
            firstName : $('#firstName').val(),
            lastName : $('#lastName').val(),
            email :  $('#emailRegistration').val(),
            mobile : $('#mobile').val(),
            address : $('#address').val(),
            country : $('#country').val(),
            password : $('#password').val()
        }

        var url = '${saveUser}'+'?roleName='+$('#role').val();

        $.ajax({
            url: url,
            method: "POST",
            data: JSON.stringify(formData),
            dataType: 'json',
            contentType: "application/json",
            beforeSend : function(xhr){

            },
            success: function(result,status,jqXHR ) {
                $('#registrationModal').modal('hide');
                alert("Registration successful!");
            }
        });

    }
    // function login() {
    //     var formData ={
    //         username : $('#username').val(),
    //         password : $('#password').val(),
    //         csrf:token
    //     }
    //     var token = $("meta[name='_csrf']").attr("content");
    //     var header = $("meta[name='_csrf_header']").attr("content");
    //     $.ajax({
    //         url: '/login',
    //         method: "POST",
    //         data: JSON.stringify(formData),
    //         dataType: 'json',
    //         contentType: "application/json",
    //         success: function(result,status,jqXHR ) {
    //             location.reload();
    //         }
    //     });
    //
    // }
</script>