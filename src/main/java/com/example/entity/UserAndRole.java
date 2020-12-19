package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAndRole extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long roleId;
    private Long userId;

    public Long getId() {
        return id;
    }

    public UserAndRole setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRoleId() {
        return roleId;
    }

    public UserAndRole setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public UserAndRole setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
