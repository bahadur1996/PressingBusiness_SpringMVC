<%@ page import="com.khela.utils.AuthenticationManager" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/29/2020
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%--place this inside body tag for each jsp file--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="logOutUrl" value="/rest/user/logoutUrl"/>

<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">Khela Computer</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/">Home</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#contact">Contact</a></li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" roleEntity="button" aria-haspopup="true" aria-expanded="false">Services <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Press service</a></li>
                                <li><a href="#">Book print</a></li>
                                <li><a href="#">Office Id</a></li>
                                <li><a href="#">Crest</a></li>
                                <li><a href="#">Digital media</a></li>
                            </ul>
                        </li>
                        <% if(AuthenticationManager.isLoggedIn() && AuthenticationManager.getLoggedInUser().getRoleNames().contains("ADMIN")){ %>

                        <li><a href="/admin/admin.html">Admin</a></li>

                        <li><a href='${logOutUrl}'>Logout</a></li>

                        <% } else if(AuthenticationManager.isLoggedIn() && !AuthenticationManager.getLoggedInUser().getRoleNames().contains("ADMIN")) {%>

                        <li><a href='${logOutUrl}'>Logout</a></li>

                        <% } else {%>
                        <li><button class="btn btn-primary" onclick="showLoginForm()">Sign in</button></li>
                        <li><button class="btn btn-primary" onclick="showModal()">Sign up</button></li>
                        <% } %>
                    </ul>
                </div>
            </div>
        </nav>

    </div>
</div>
<jsp:include page="registration-form.jsp"/>
<div style="height: 12%;width: 100%;background-color: #2b669a;">

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery-1.11.3.minjs"/>"><\/script>')</script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script>
    $( document ).ready(function () {
        if('${toLogin}'){
            showLoginForm();
        }
    });
</script>