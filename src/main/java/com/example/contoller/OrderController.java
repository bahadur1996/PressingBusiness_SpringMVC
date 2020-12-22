package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @RequestMapping("/order.html")
    public String orderForm(){

        return "orderforms/orderform";
    }
}
