package com.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role",schema = "public")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
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

    public Set<UserEntity> getUsers() {
        return users;
    }

    public Role setUsers(Set<UserEntity> users) {
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
