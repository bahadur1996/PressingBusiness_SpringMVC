package com.khela.util;

import com.khela.domain.Order;
import com.khela.entity.PriceEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.math.BigDecimal;


@Repository
@Transactional
public class DatabaseRepository {

    private final EntityManager entityManager;

    public DatabaseRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public BigDecimal getTotalPrice(Order order){

        String hql=" select price.price from PriceEntity as price where price.productName=:pName and " +
                "price.size=:size and price.paperType=:pType and price.paperThickness=:pThickness and price.color=:color and " +
                "price.laminationRequired=:lRequired and price.laminationType=:lType and price.spotRequired=:sRequired and " +
                "price.airbrushRequired=:aRequired and price.bindingRequired=:bRequired";

        Query query = getSession().createQuery(hql)
                .setParameter("pName",order.getProductName())
                .setParameter("size",order.getSize())
                .setParameter("pType",order.getPaperType())
                .setParameter("pThickness",order.getPaperThickness())
                .setParameter("color",order.getColor())
                .setParameter("lRequired",order.getLaminationRequired())
                .setParameter("lType",order.getLaminationType())
                .setParameter("sRequired",order.getSpotRequired())
                .setParameter("aRequired",order.getAirbrushRequired())
                .setParameter("bRequired",order.getBindingRequired());

        BigDecimal totalPrice = !query.list().isEmpty()?(BigDecimal) query.list().get(0):BigDecimal.ZERO;
        totalPrice = totalPrice.multiply(BigDecimal.valueOf(order.getQuantity()));
        return totalPrice;
    }

    private Session getSession() {
            return entityManager.unwrap(Session.class);
    }


}
