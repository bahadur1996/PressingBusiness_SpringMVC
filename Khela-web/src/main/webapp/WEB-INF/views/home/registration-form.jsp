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


            <div class="modal fade" id="loginModal" tabindex="-1" roleEntity="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog" roleEntity="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="myModalLabel">Login form</h4>
                        </div>
                        <div class="modal-body">
                                <div class="form-group">
                                    <label for="email">Email address</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <input type="email" class="form-control" id="email" placeholder="Email">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <input type="password" class="form-control" id="pws" placeholder="Password">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    </div>
                                </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Log in</button>
                        </div>
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
<%--                            <form class="pb-modalreglog-form-reg">--%>
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
                                        <input type="password" name = "password" id="password" class="form-control" placeholder="Password"/>
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
<%--                            </form>--%>
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
    }
    function submit(){

        var formData ={
            id: null,
            firstName : $('#firstName').val(),
            lastName : $('#lastName').val(),
            email :  $('#emailRegistration').val(),
            mobile : $('#mobile').val(),
            address : $('#address').val(),
            country : $('#country').val(),
            password : $('#password').val()
        }

        var url = '${saveUser}'+'?roleName='+$('#role').val();
        console.log($('#role').val());
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
</script>