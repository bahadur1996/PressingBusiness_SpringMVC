package com.khela.rest;

import com.khela.domain.Order;
import com.khela.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/rest/order")
public class OrderRestController {

    private final OrderService orderService;

    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
        public ResponseEntity<Order> addOrder(@RequestBody Order order){
            return ResponseEntity.ok(orderService.addOrder(order));
        }
}
