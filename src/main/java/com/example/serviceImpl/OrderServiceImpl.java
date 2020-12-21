package com.example.serviceImpl;

import com.example.domain.Order;
import com.example.entity.OrderEntity;
import com.example.mapper.OrderMapper;
import com.example.repository.OrderRepository;
import com.example.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final OrderMapper orderMapper;

    public OrderServiceImpl(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }


    @Override
    public Order addOrder(Order order) {
        OrderEntity orderEntity = orderRepository.save(orderMapper.domainToEntity().map(order));
        return orderMapper.entityToDomain().map(orderEntity);
    }

    @Override
    public Order editOrder(Order order) {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {

    }

    @Override
    public Order getOrderDetails(Long orderId) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }
}
