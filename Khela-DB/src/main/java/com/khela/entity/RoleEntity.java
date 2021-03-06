package com.khela.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role",schema = "public")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String roleName;

    @ManyToMany(mappedBy = "roleEntities")
    private Set<UserEntity> users;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private Set<PrivilegeEntity> privilegeEntities;

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

    public Set<UserEntity> getUsers() {
        return users;
    }

    public RoleEntity setUsers(Set<UserEntity> users) {
        this.users = users;
        return this;
    }

    public Set<PrivilegeEntity> getPrivilegeEntities() {
        return privilegeEntities;
    }

    public RoleEntity setPrivilegeEntities(Set<PrivilegeEntity> privilegeEntities) {
        this.privilegeEntities = privilegeEntities;
        return this;
    }
}
