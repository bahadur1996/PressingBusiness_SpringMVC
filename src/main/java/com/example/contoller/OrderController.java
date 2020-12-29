package com.example.contoller;

import com.example.enumtype.ServiceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OrderController {
    @RequestMapping("/order.html")
    public String orderForm(@RequestParam(value = "serviceType",required = false)ServiceType serviceType, HttpServletRequest request){
        request.setAttribute("serviceType",serviceType.toString());
        return "home/order";
    }
}
