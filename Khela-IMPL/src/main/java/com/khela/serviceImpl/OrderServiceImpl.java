package com.khela.serviceImpl;

import com.khela.domain.Order;
import com.khela.entity.OrderEntity;
import com.khela.mapper.OrderMapper;
import com.khela.repository.OrderRepository;
import com.khela.service.OrderService;
import com.khela.util.DatabaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final OrderMapper orderMapper;

    private final DatabaseRepository databaseRepository;

    public OrderServiceImpl(OrderRepository orderRepository, OrderMapper orderMapper, DatabaseRepository databaseRepository) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.databaseRepository = databaseRepository;
    }


    @Override
    public Order addOrder(Order order) {

        order.setTotalPrice(databaseRepository.getTotalPrice(order));

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

        return orderMapper.listEntityToListDomain(orderRepository.findAll());
    }
}
