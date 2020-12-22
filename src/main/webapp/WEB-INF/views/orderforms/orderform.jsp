<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/21/2020
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="./../header.jsp"/>



<div class="container">

        <div class="row">
            <div class="col-lg-4">
                <div >
                    <h2>Services</h2>
                    <p>Magnam dolores commodi suscipit nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
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
                        <label class="control-label">Product name</label>
                        <input type="text" name = "productName" id="productName" class="form-control"/>
                    </div>
                    <div class="col-lg-4">
                        <label class="control-label">Size</label>
                        <input type="text" name = "size" id="size" class="form-control"/>
                    </div>
                </div>

            </div>
        </div>

    </div>


</html>