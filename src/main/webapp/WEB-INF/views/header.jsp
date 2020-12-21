<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/22/2020
  Time: 1:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Khela Computer</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="<c:url value="/resources/img/favicon.png" />" rel="icon">
    <link href="<c:url value="/resources/img/apple-touch-icon.png" />" rel="apple-touch-icon">
    <%--    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">--%>

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <link href="<c:url value="/resources/vendor/icofont/icofont.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/vendor/boxicons/css/boxicons.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/vendor/remixicon/remixicon.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/vendor/venobox/venobox.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/vendor/owl.carousel/assets/owl.carousel.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/vendor/aos/aos.css" />" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <style>
        html, body {
            min-height: 100%;
        }
        body, div, form, input, select {
            padding: 0;
            margin: 0;
            outline: none;
            font-family: Roboto, Arial, sans-serif;
            font-size: 14px;
            color: #666;
            line-height: 22px;
        }
        h1, h4 {
            margin: 15px 0 4px;
            font-weight: 400;
        }
        h4 {
            margin: 20px 0 4px;
            font-weight: 400;
        }
        span {
            color: red;
        }
        .small {
            font-size: 10px;
            line-height: 18px;
        }
        .testbox {
            display: flex;
            justify-content: center;
            align-items: center;
            height: inherit;
            padding: 3px;
        }
        form {
            width: 100%;
            padding: 20px;
            background: #fff;
            box-shadow: 0 2px 5px #ccc;
        }
        input {
            width: calc(100% - 10px);
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
            vertical-align: middle;
        }
        input:hover, textarea:hover, select:hover {
            outline: none;
            border: 1px solid #095484;
            background: #e6eef7;
        }
        .title-block select, .title-block input {
            margin-bottom: 10px;
        }
        select {
            padding: 7px 0;
            border-radius: 3px;
            border: 1px solid #ccc;
            background: transparent;
        }
        select, table {
            width: 100%;
        }
        option {
            background: #fff;
        }
        .day-visited, .time-visited {
            position: relative;
        }
        input[type="date"]::-webkit-inner-spin-button {
            display: none;
        }
        input[type="time"]::-webkit-inner-spin-button {
            margin: 2px 22px 0 0;
        }
        .day-visited i, .time-visited i, input[type="date"]::-webkit-calendar-picker-indicator {
            position: absolute;
            top: 8px;
            font-size: 20px;
        }
        .day-visited i, .time-visited i {
            right: 5px;
            z-index: 1;
            color: #a9a9a9;
        }
        [type="date"]::-webkit-calendar-picker-indicator {
            right: 0;
            z-index: 2;
            opacity: 0;
        }
        .question-answer label {
            display: block;
            padding: 0 20px 10px 0;
        }
        .question-answer input {
            width: auto;
            margin-top: -2px;
        }
        th, td {
            width: 18%;
            padding: 15px 0;
            border-bottom: 1px solid #ccc;
            text-align: center;
            vertical-align: unset;
            line-height: 18px;
            font-weight: 400;
            word-break: break-all;
        }
        .first-col {
            width: 25%;
            text-align: left;
        }
        textarea {
            width: calc(100% - 6px);
        }
        .btn-block {
            margin-top: 20px;
            text-align: center;
        }
        button {
            width: 150px;
            padding: 10px;
            border: none;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            background-color: #095484;
            font-size: 16px;
            color: #fff;
            cursor: pointer;
        }
        button:hover {
            background-color: #0666a3;
        }
        @media (min-width: 568px) {
            .title-block {
                display: flex;
                justify-content: space-between;
            }
            .title-block select {
                width: 30%;
                margin-bottom: 0;
            }
            .title-block input {
                width: 31%;
                margin-bottom: 0;
            }
            th, td {
                word-break: keep-all;
            }
        }
    </style>

</head>

<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center">
    <div class="container">
        <div class="header-container d-flex align-items-center">
            <div class="logo mr-auto">
                <h1 class="text-light align-content-center"><a href="index.html"><span>Khela Computer</span></a></h1>
                <!-- Uncomment below if you prefer to use an image logo -->
                <%--                <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>--%>
            </div>

            <nav class="nav-menu d-none d-lg-block">
                <ul>
                    <li class="active"><a href="#header">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#services">Services</a></li>
                    <li><a href="#portfolio">Portfolio</a></li>
                    <li class="drop-down"><a href="">Drop Down</a>
                        <ul>
                            <li><a href="#">Drop Down 1</a></li>
                            <li class="drop-down"><a href="#">Drop Down 2</a>
                                <ul>
                                    <li><a href="#">Deep Drop Down 1</a></li>
                                    <li><a href="#">Deep Drop Down 2</a></li>
                                    <li><a href="#">Deep Drop Down 3</a></li>
                                    <li><a href="#">Deep Drop Down 4</a></li>
                                    <li><a href="#">Deep Drop Down 5</a></li>
                                </ul>
                            </li>
                            <li><a href="#">Drop Down 3</a></li>
                            <li><a href="#">Drop Down 4</a></li>
                            <li><a href="#">Drop Down 5</a></li>
                        </ul>
                    </li>
                    <li><a href="#contact">Contact</a></li>

                    <li class="get-started"><a href="#about">Get Started</a></li>
                </ul>
            </nav><!-- .nav-menu -->
        </div><!-- End Header Container -->
    </div>
</header><!-- End Header -->


