<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 12/29/2020
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


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
                            <form>
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
                            </form>
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
                            <h4 class="modal-title" id="registrationModalLabel"> Oops! you are not logged in. Tell us who you are</h4>
                        </div>
                        <div class="modal-body">
                            <form class="pb-modalreglog-form-reg">
                                <div class="form-group">
                                    <div id="pb-modalreglog-progressbar"></div>
                                </div>
                                <div class="form-group">
                                    <label for="customerName">Name </label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                        <input type="text" class="form-control" id="customerName" placeholder="Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="customerMobile">Mobile</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-phone"></span></span>
                                        <input type="text" class="form-control" id="customerMobile" placeholder="Mobile">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="customerEmail">Email</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-inbox"></span></span>
                                        <input type="email" class="form-control" id="customerEmail" placeholder="Email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="customerAddress">Address</label>
                                    <div class="input-group pb-modalreglog-input-group">
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-globe"></span></span>
                                        <input type="text" class="form-control" id="customerAddress" placeholder="Address">
                                    </div>
                                </div>

                            </form>
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
    // $(function () {
    //     var progress = $("#pb-modalreglog-progressbar").shieldProgressBar({
    //         value: 0
    //     }).swidget();
    //
    //     $('#inputEmail').change(function () {
    //         if ($('#inputEmail').val().length > 1) {
    //             progress.value(progress.value() + 15);
    //         } else {
    //             progress.value(progress.value() - 15);
    //         }
    //     });
    //
    //     $('#inputPws').change(function () {
    //         if ($('#inputPws').val().length > 1) {
    //             progress.value(progress.value() + 15);
    //         } else {
    //             progress.value(progress.value() - 15);
    //         }
    //     });
    //
    //     $('#inputConfirmPws').change(function () {
    //         if ($('#inputConfirmPws').val().length > 1) {
    //             progress.value(progress.value() + 15);
    //         } else {
    //             progress.value(progress.value() - 15);
    //         }
    //     });
    //
    //     $('#countries').change(function () {
    //         if ($('#countries').val().length > 1) {
    //             progress.value(progress.value() + 15);
    //         } else {
    //             progress.value(progress.value() - 15);
    //         }
    //     });
    //
    //     $('#age').change(function () {
    //         if ($('#age').val().length > 1) {
    //             progress.value(progress.value() + 15);
    //         } else {
    //             progress.value(progress.value() - 15);
    //         }
    //     });
    //
    //     $('#ch').change(function () {
    //         if ($('input[name="chs"]:checked').length > 0) {
    //             progress.value(progress.value() + 25);
    //         } else {
    //             progress.value(progress.value() - 25);
    //         }
    //     });
    //
    //     $("#age").shieldMaskedTextBox({
    //         enabled: true,
    //         mask: "00/00/0000",
    //         value: "19/03/1032"
    //     });
    // })
</script>

<script>
    function closeModal(){
        $('#registrationModal').modal('hide');
    }
</script>