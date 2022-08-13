package com.khela.controller;


import com.khela.service.OrderService;
import com.khela.service.PriceService;
import com.khela.service.ProductService;
import com.khela.utils.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    private final OrderService orderService;

    private final ProductService productService;

    private final PriceService priceService;

    public HomeController(OrderService orderService, ProductService productService, PriceService priceService) {
        this.orderService = orderService;
        this.productService = productService;
        this.priceService = priceService;
    }


    @RequestMapping("/")
    public String home(Model model, @RequestParam(value = "toLogin",required = false) Boolean toLogin){
        model.addAttribute("toLogin",toLogin);

        return "home/home";
}
    @RequestMapping("/admin/admin.html")
    public String admin(ModelMap model){

        model.addAttribute("orders",orderService.getAllOrders());
        model.addAttribute("services",productService.getAllProducts());
        model.addAttribute("prices",priceService.getAllPrices());

        return "admin";
    }
}
