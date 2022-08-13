package com.khela.controller;


import com.khela.service.OrderService;
import com.khela.service.PriceService;
import com.khela.service.ProductService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    @RequestMapping("/admin/admin.html")
    public String admin(ModelMap model){

        model.addAttribute("orders",orderService.getAllOrders());
        model.addAttribute("services",productService.getAllProducts());
        model.addAttribute("prices",priceService.getAllPrices());

        return "admin";
    }
    @GetMapping(value = "/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
        }
        return "home/home";
    }

}
