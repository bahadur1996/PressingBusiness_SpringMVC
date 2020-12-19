package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "role",schema = "public")
public class RoleEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String roleName;


    public Long getId() {
        return id;
    }

    public RoleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public RoleEntity setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
}
