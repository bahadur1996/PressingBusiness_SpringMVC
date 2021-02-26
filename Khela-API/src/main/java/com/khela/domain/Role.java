package com.khela.domain;


import java.util.Set;

public class Role {

    private Long id;

    private String roleName;

    private Set<User> users;

    private Set<Privilege> privileges;

    public Long getId() {
        return id;
    }

    public Role setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Role setUsers(Set<User> users) {
        this.users = users;
        return this;
    }

    public Set<Privilege> getPrivileges() {
        return privileges;
    }

    public Role setPrivileges(Set<Privilege> privileges) {
        this.privileges = privileges;
        return this;
    }
}
