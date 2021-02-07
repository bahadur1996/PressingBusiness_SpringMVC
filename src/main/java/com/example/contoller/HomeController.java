package com.example.contoller;

import com.example.service.OrderService;
import com.example.service.PriceService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String home(){
        return "home/home";
}
    @RequestMapping("/index.html")
    public String index(){

        return "index";
    }
    @RequestMapping("/admin.html")
    public String admin(ModelMap model){

        model.addAttribute("orders",orderService.getAllOrders());
        model.addAttribute("services",productService.getAllProducts());
        model.addAttribute("prices",priceService.getAllPrices());

        

        return "admin";
    }

}
