package com.khela.domain;

import java.util.Set;

public class Privilege {

    private Long id;

    private String name;

    private Set<Role> roles;

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

    public Set<Role> getRoles() {
        return roles;
    }

    public Privilege setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }
}
