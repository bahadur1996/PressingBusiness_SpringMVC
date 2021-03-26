<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/21/2020
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>

<c:url var="saveOrder" value="/rest/order"/>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Khela Computer</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/my-style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/components.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/components-md.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/components-rounded.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins-md.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/plugins.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/select2.min.css" />" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">
</head>
<!-- NAVBAR
================================================== -->
<body>
<jsp:include page="common.jsp"/>



<div class="container">

        <div class="row">
            <div class="col-lg-4">
                <div >
                    <c:choose>

                        <c:when test="${serviceType=='BOOK_PRINT'}">
                           <h1>Printing</h1>
                        </c:when>
                    </c:choose>
                    <h3>Book printing</h3>
                    <p>Medical Book, University Book, Engineering Book, Medical Book, PDF Book Print</p>
                    <h3>Thesis priting</h3>
                    <p>All kind of thesis, academic papers.</p>
                </div>
            </div>
            <div class="col-lg-8 form-group margin-top-10">
                <h2>Please tell us what we have to do.</h2>
                <div class="row">
                    <div class="col-lg-4">
                        <label class="control-label">Product name</label>
                        <input type="text" name = "productName" id="productName" class="form-control"/>
                    </div>
                    <div class="col-lg-4">
                        <label class="control-label">Size</label>
                        <input type="text" name = "size" id="size" class="form-control"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <label class="control-label">Paper type</label>
                        <select id="paperType" name="paperType" class="form-control">
                            <option value="">Select paper type</option>
                            <option value="Offset">Offset</option>
                        </select>
                    </div>
                    <div class="col-lg-4">
                        <label class="control-label">Paper thickness</label>
                        <select id="paperThickness" name="paperThickness" class="form-control">
                            <option value="">Select paper thickness</option>
                            <option value="Eighty">Eighty</option>
                            <option value="Hundred">Hundred</option>
                            <option value="Hundred_20">Hundred 20</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <label class="control-label">Color type</label>
                        <select id="color" name="color" class="form-control">
                            <option value="">Select color</option>
                            <option value="One">One</option>
                            <option value="Two">Two</option>
                            <option value="Three">Three</option>
                            <option value="Four">Four</option>
                        </select>
                    </div>
                    <div class="col-lg-4">
                        <label class="control-label">Quantity</label>
                        <input type="number" name = "quantity" id="quantity" class="form-control"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <input  type="checkbox" name="laminationRequired" id="laminationRequired"/>
                        <span class="checkboxtext">Lamination required </span>
                    </div>
                    <div class="col-lg-4" id="laminationTypeDiv">
                        <label class="control-label">Lamination type</label>
                        <select id="laminationType" name="laminationType" class="form-control">
                            <option value="">Select color</option>
                            <option value="Mat">Mat</option>
                            <option value="Glue">Glue</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <input type="checkbox" name = "spotRequired" id="spotRequired"/>
                        <span class="checkboxtext">Spot required</span>
                    </div>
                    <div class="col-lg-4">
                        <input type="checkbox" name = "airbrushRequired" id="airbrushRequired"/>
                        <span class="checkboxtext">Airbrush required</span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <input type="checkbox" name = "bindingRequired" id="bindingRequired"/>
                        <span class="checkboxtext">Binding required</span>
                    </div>
                    <div class="col-lg-4">
                        <label class="control-label">Delivery date</label>
                        <input type="date" name = "deliveryDate" id="deliveryDate" class="form-control"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-2" style="text-align: right;">
                        <button class="btn-lg btn-info" onclick="showModal()">Submit</button>
                    </div>
                </div>

            </div>

        </div>

    </div>
<jsp:include page="registration-form.jsp"/>
</body>
</html>
<%--all scripts go here--%>
<script>
    function submit(){

        var formData ={
            customerName: $('#customerName').val(),
            customerEmail: $('#customerEmail').val(),
            customerMobile : $('#customerMobile').val(),
            customerAddress :  $('#customerAddress').val(),
            productName : '${serviceType}',
            size : $('#size').val(),
            paperType : $('#paperType').val(),
            paperThickness : $('#paperThickness').val(),
            color : $('#color').val(),
            quantity : $('#quantity').val(),
            laminationRequired : getCheckBoxStatus("laminationRequired"),
            laminationType : $('#laminationType').val(),
            spotRequired : getCheckBoxStatus("spotRequired"),
            airbrushRequired : getCheckBoxStatus("airbrushRequired"),
            bindingRequired : getCheckBoxStatus("bindingRequired"),
            deliveryDate :  $('#deliveryDate').val(),
        }
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");

        $.ajax({
            url: '${saveOrder}',
            method: "POST",
            data: JSON.stringify(formData),
            dataType: 'json',
            contentType: "application/json",
            beforeSend : function(xhr){
                xhr.setRequestHeader(header,token);
            },
            success: function(result,status,jqXHR ) {
                $('#registrationModal').modal('hide');
            }
        });

    }
    function getCheckBoxStatus(id){
        return document.getElementById(id).checked ? true : false;
    }
    function showModal(){

        $('#registrationModal').modal('toggle');
    }
</script>

<script>
    $( document ).ready(function() {
        $("#laminationTypeDiv").hide();
        $('#laminationRequired').change(function() {
            if(this.checked) {
                $("#laminationTypeDiv").show();
            }else {
                $("#laminationTypeDiv").hide();
            }
        });
    });
</script>

