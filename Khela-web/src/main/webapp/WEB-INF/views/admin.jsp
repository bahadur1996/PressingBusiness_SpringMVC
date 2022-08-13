<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2/6/2021
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<c:url var="savePrice" value="/rest/price"/>

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

<body>
<jsp:include page="./home/common.jsp"/>
<div class="container">
    <ul class="nav nav-pills nav-fill">

        <li class="nav-item">
            <a class="nav-item nav-link" id="defaultTab" data-toggle="tab" href="#orderTab" roleEntity="tab">Orders</a>
        </li>
        <li class="nav-item">
            <a class="nav-item nav-link" data-toggle="tab" href="#serviceTab" roleEntity="tab">Existing services</a>
        </li>
        <li class="nav-item">
            <a class="nav-item nav-link" data-toggle="tab" href="#priceTab" roleEntity="tab">Pricing</a>
        </li>

    </ul>
    <div class="tab-content">
        <div class="tab-pane fade" id="orderTab">

            <table id="orderTable" class="table table-striped table-bordered" style="width:100%">
                <thead>
                <tr>
                    <th hidden="hidden"></th>
                    <th>Customer name</th>
                    <th>Customer mobile</th>
                    <th>Product name</th>
                    <th>Quantity</th>
                    <th>TotalPrice</th>
                    <th>Delivery date</th>
                    <th>Details</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${orders}" var="order">
                    <tr>
                        <td hidden="hidden">"${order.id}"</td>
                        <td>${order.customerName}</td>
                        <td>${order.customerMobile}</td>
                        <td>${order.productName}</td>
                        <td>${order.quantity}</td>
                        <td>${order.totalPrice}</td>
                        <td>${order.deliveryDate}</td>
                        <td><input type="submit" class="btn-info" value="Details"/> </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="tab-pane fade" id="serviceTab">
            <div class="margin-bottom-5 text-right">
                <input type="submit" class="btn-info btn-lg" value="Add new service"/>
            </div>
            <table id="serviceTable" class="table table-striped table-bordered" style="width:100%">
                <thead>
                <tr>
                    <th hidden="hidden"></th>
                    <th>Service name</th>
                    <th>Description</th>
                    <th>Unit price</th>
                    <th>Edit</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${services}" var="service">
                    <tr>
                        <td hidden="hidden">"${service.id}"</td>
                        <td>${service.productName}</td>
                        <td>${service.description}</td>
                        <td>${service.price}</td>
                        <td><input type="submit" class="btn-info" value="Edit"/> </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

        <div class="tab-pane fade" id="priceTab">
            <div class="margin-bottom-5 text-right">
                <input type="submit" class="btn-info btn-lg" id="newPriceBtn" value="Add new price"/>
            </div>
            <table id="priceTable" class="table table-striped table-bordered" style="width:100%">
                <thead>
                <tr>
                    <th hidden="hidden"></th>
                    <th>Product name</th>
                    <th>Size</th>
                    <th>Paper type</th>
                    <th>Paper thickness</th>
                    <th>Color</th>
                    <th>Lamination</th>
                    <th>Lamination type</th>
                    <th>Spot</th>
                    <th>Airbrush</th>
                    <th>Binding</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${prices}" var="price">
                    <tr>
                        <td hidden="hidden">"${price.id}"</td>
                        <td>${price.productName}</td>
                        <td>${price.size}</td>
                        <td>${price.paperType}</td>
                        <td>${price.paperThickness}</td>
                        <td>${price.color}</td>
                        <td>${price.laminationRequired}</td>
                        <td>${price.laminationType}</td>
                        <td>${price.spotRequired}</td>
                        <td>${price.airbrushRequired}</td>
                        <td>${price.bindingRequired}</td>
                        <td>${price.price}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>


    <div class="modal fade" id="priceAddModal" tabindex="-1" roleEntity="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" roleEntity="document">
            <div class="modal-content">
                <div class="modal-header" style="background-color: yellow;">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="registrationModalLabel"> Register product specific price</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-lg-6">
                            <label class="control-label">Product name</label>
                            <input type="text" name = "productName" id="productName" class="form-control" placeholder="Product name"/>
                        </div>
                        <div class="col-lg-6">
                            <label class="control-label">Size</label>
                            <input type="text" name = "size" id="size" class="form-control" placeholder="Size"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <label class="control-label">Paper type</label>
                            <select id="paperType" name="paperType" class="form-control">
                                <option value="">Select paper type</option>
                                <option value="Offset">Offset</option>
                            </select>
                        </div>
                        <div class="col-lg-6">
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
                        <div class="col-lg-6">
                            <label class="control-label">Color type</label>
                            <select id="color" name="color" class="form-control">
                                <option value="">Select color</option>
                                <option value="One">One</option>
                                <option value="Two">Two</option>
                                <option value="Three">Three</option>
                                <option value="Four">Four</option>
                            </select>
                        </div>
                        <div class="col-lg-6">
                            <input type="checkbox" name = "bindingRequired" id="bindingRequired"/>
                            <span class="checkboxtext">Binding required</span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <input  type="checkbox" name="laminationRequired" id="laminationRequired"/>
                            <span class="checkboxtext">Lamination required </span>
                        </div>
                        <div class="col-lg-6" id="laminationTypeDiv">
                            <label class="control-label">Lamination type</label>
                            <select id="laminationType" name="laminationType" class="form-control">
                                <option value="">Select color</option>
                                <option value="Mat">Mat</option>
                                <option value="Glue">Glue</option>
                            </select>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-6">
                            <input type="checkbox" name = "spotRequired" id="spotRequired"/>
                            <span class="checkboxtext">Spot required</span>
                        </div>
                        <div class="col-lg-6">
                            <input type="checkbox" name = "airbrushRequired" id="airbrushRequired"/>
                            <span class="checkboxtext">Airbrush required</span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <label class="control-label">Price</label>
                            <input type="number" name = "price" id="price" class="form-control" placeholder="Price"/>
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="button" class="btn btn-primary" onclick="submitPrice()">Submit</button>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>
<script>
    $(document).ready(function() {

        $('#defaultTab').click();
        $('#priceAddModal').modal('hide');

        $('#newPriceBtn').on('click',function () {
            $('#priceAddModal').modal('toggle');
        })

    } );
    function submitPrice(){

        var formData ={
            productName :  $('#productName').val(),
            size : $('#size').val(),
            paperType : $('#paperType').val(),
            paperThickness : $('#paperThickness').val(),
            color : $('#color').val(),
            laminationRequired : getCheckBoxStatus("laminationRequired"),
            laminationType : $('#laminationType').val(),
            spotRequired : getCheckBoxStatus("spotRequired"),
            airbrushRequired : getCheckBoxStatus("airbrushRequired"),
            bindingRequired : getCheckBoxStatus("bindingRequired"),
            price :  $('#price').val()
        }
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");

        $.ajax({
            url: '${savePrice}',
            method: "POST",
            data: JSON.stringify(formData),
            dataType: 'json',
            contentType: "application/json",
            beforeSend : function(xhr){
                xhr.setRequestHeader(header,token);
            },
            success: function(result,status,jqXHR ) {
                $('#priceAddModal').modal('hide');
            }
        });
    }
    function getCheckBoxStatus(id){
        return document.getElementById(id).checked ? true : false;
    }

</script>