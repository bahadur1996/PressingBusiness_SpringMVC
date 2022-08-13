package com.khela.service;


import com.khela.domain.Order;
import java.util.List;

public interface OrderService {
    Order addOrder(Order order);
    Order editOrder(Order order);
    void deleteOrder(Long orderId);
    Order getOrderDetails(Long orderId);
    List<Order> getAllOrders();
}
