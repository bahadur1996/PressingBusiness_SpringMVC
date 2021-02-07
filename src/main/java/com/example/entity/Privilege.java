package com.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
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
