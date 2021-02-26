package com.khela.repository;

import com.khela.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<PriceEntity,Long> {
}
