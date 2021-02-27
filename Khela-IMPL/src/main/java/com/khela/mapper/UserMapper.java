package com.khela.mapper;

import com.khela.domain.Role;
import com.khela.domain.User;
import com.khela.entity.RoleEntity;
import com.khela.entity.UserEntity;
import com.khela.utils.Mapper;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserMapper {

    private final RoleMapper roleMapper;

    public UserMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    public Mapper<UserEntity, User> entityToDomain(){
        return entity->new User()
                .setId(entity.getId())
                .setFirstName(entity.getFirstName())
                .setLastName(entity.getLastName())
                .setEmail(entity.getEmail())
                .setMobile(entity.getMobile())
                .setAddress(entity.getAddress())
                .setCountry(entity.getCountry())
                .setEnabled(entity.getEnabled())
                .setTokenExpired(entity.getTokenExpired())
                .setPassword(entity.getPassword())
                .setRoles(roleMapper.listEntityToListDomain(entity.getRoleEntities()));
    }
    public Mapper<User,UserEntity> domainToEntity(){
        return domain->new UserEntity()
                .setId(domain.getId())
                .setFirstName(domain.getFirstName())
                .setLastName(domain.getLastName())
                .setEmail(domain.getEmail())
                .setMobile(domain.getMobile())
                .setAddress(domain.getAddress())
                .setCountry(domain.getCountry())
                .setEnabled(domain.getEnabled())
                .setTokenExpired(domain.getTokenExpired())
                .setPassword(domain.getPassword())
                .setRoleEntities(roleMapper.listDomainToListEntity(domain.getRoles()));
    }

    public List<User> listEntityToListDomain(List<UserEntity> productEntities){
        List<User> products = new ArrayList<>();
        productEntities.stream().forEach(productEntity -> products.add(entityToDomain().map(productEntity)));

        return products;
    }

    public List<UserEntity> listDomainToListEntity(List<User> products){
        List<UserEntity> productEntities = new ArrayList<>();
        products.stream().forEach(product -> productEntities.add(domainToEntity().map(product)));

        return productEntities;
    }
}
