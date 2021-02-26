package com.khela.entity;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "user",schema = "public")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String mobile;
    private String address;
    private String country;
    private Boolean enabled;
    private Boolean tokenExpired;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Set<RoleEntity> roleEntities;

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public UserEntity setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public UserEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UserEntity setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getTokenExpired() {
        return tokenExpired;
    }

    public UserEntity setTokenExpired(Boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    public Set<String> getRoleNames() {

        return roleEntities.stream().map(roleEntity -> roleEntity.getRoleName()).collect(Collectors.toSet());
    }

    public UserEntity setRoleEntities(Set<RoleEntity> roleEntities) {
        this.roleEntities = roleEntities;
        return this;
    }
}
