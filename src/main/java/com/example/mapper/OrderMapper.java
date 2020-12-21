package com.example.mapper;

import com.example.domain.Order;
import com.example.entity.OrderEntity;
import com.example.utils.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderMapper {

    public Mapper<OrderEntity, Order> entityToDomain(){
        return entity->new Order()
                .setId(entity.getId())
                .setCustomerId(entity.getCustomerId())
                .setCustomerName(entity.getCustomerName())
                .setCustomerEmail(entity.getCustomerEmail())
                .setCustomerMobile(entity.getCustomerMobile())
                .setCustomerAddress(entity.getCustomerAddress())
                .setProductId(entity.getProductId())
                .setProductName(entity.getProductName())
                .setSize(entity.getSize())
                .setPaperType(entity.getPaperType())
                .setPaperThickness(entity.getPaperThickness())
                .setColor(entity.getColor())
                .setTotalPrice(entity.getTotalPrice())
                .setLaminationRequired(entity.getLaminationRequired())
                .setLaminationType(entity.getLaminationType())
                .setSpotRequired(entity.getSpotRequired())
                .setAirbrushRequired(entity.getAirbrushRequired())
                .setBindingRequired(entity.getBindingRequired())
                .setDeliveryDate(entity.getDeliveryDate());
    }
    public Mapper<Order,OrderEntity> domainToEntity(){
        return domain->new OrderEntity()
                .setId(domain.getId())
                .setCustomerId(domain.getCustomerId())
                .setCustomerName(domain.getCustomerName())
                .setCustomerEmail(domain.getCustomerEmail())
                .setCustomerMobile(domain.getCustomerMobile())
                .setCustomerAddress(domain.getCustomerAddress())
                .setProductId(domain.getProductId())
                .setProductName(domain.getProductName())
                .setSize(domain.getSize())
                .setPaperType(domain.getPaperType())
                .setPaperThickness(domain.getPaperThickness())
                .setColor(domain.getColor())
                .setTotalPrice(domain.getTotalPrice())
                .setLaminationRequired(domain.getLaminationRequired())
                .setLaminationType(domain.getLaminationType())
                .setSpotRequired(domain.getSpotRequired())
                .setAirbrushRequired(domain.getAirbrushRequired())
                .setBindingRequired(domain.getBindingRequired())
                .setDeliveryDate(domain.getDeliveryDate());
    }

    public List<Order> listEntityToListDomain(List<OrderEntity> productEntities){
        List<Order> products = new ArrayList<>();
        productEntities.stream().forEach(productEntity -> products.add(entityToDomain().map(productEntity)));

        return products;
    }

    public List<OrderEntity> listDomainToListEntity(List<Order> products){
        List<OrderEntity> productEntities = new ArrayList<>();
        products.stream().forEach(product -> productEntities.add(domainToEntity().map(product)));

        return productEntities;
    }

}
