package com.khela.repository;

import com.khela.entity.PrivilegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<PrivilegeEntity,Long> {
    PrivilegeEntity findByName(String name);
}
