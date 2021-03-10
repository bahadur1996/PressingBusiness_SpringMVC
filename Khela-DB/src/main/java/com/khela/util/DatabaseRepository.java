package com.khela.util;

import com.khela.domain.Order;
import com.khela.entity.OrderEntity;
import com.khela.entity.PriceEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@Repository
@Transactional
public class DatabaseRepository {

    private final EntityManager entityManager;

    public DatabaseRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    public BigDecimal getTotalPrice(OrderEntity orderEntity){
//
//
//        Query<PriceEntity> query = getSession().createQuery(" select unitPrice.price from PriceEntity as unitPrice where  ")
//    }

    private Session getSession() {
            return entityManager.unwrap(Session.class);
    }


}
