package com.khela.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PrivilegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privilegeEntities")
    private Set<RoleEntity> roleEntities;

    public Long getId() {
        return id;
    }

    public PrivilegeEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PrivilegeEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Set<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    public PrivilegeEntity setRoleEntities(Set<RoleEntity> roleEntities) {
        this.roleEntities = roleEntities;
        return this;
    }
}
