package com.khela.domain;

import java.util.Set;

public class Privilege {

    private Long id;

    private String name;

    private Set<Role> roleEntities;

    public Long getId() {
        return id;
    }

    public Privilege setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Privilege setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Role> getRoleEntities() {
        return roleEntities;
    }

    public Privilege setRoleEntities(Set<Role> roleEntities) {
        this.roleEntities = roleEntities;
        return this;
    }
}
