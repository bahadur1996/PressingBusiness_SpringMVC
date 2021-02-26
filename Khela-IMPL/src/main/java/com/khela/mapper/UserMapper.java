package com.khela.mapper;

import com.khela.domain.Role;
import com.khela.domain.User;
import com.khela.entity.RoleEntity;
import com.khela.entity.UserEntity;
import com.khela.utils.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserMapper {

    private static ModelMapper modelMapper= new ModelMapper();

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
                .setRoles(getRoleDomains(entity.getRoleEntities()));
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
                .setRoleEntities(getRoleEntities(domain.getRoles()));
    }

    public Set<Role> getRoleDomains(Set<RoleEntity> roleEntities){
        Set<Role> roles = new HashSet();
        for(RoleEntity roleEntity : roleEntities){
            roles.add(modelMapper.map(roleEntity,Role.class));
        }
       return roles;
    }

    public Set<RoleEntity> getRoleEntities(Set<Role> roles){
        Set<RoleEntity> roleEntities = new HashSet();
        for(Role role : roles){
            roleEntities.add(modelMapper.map(role,RoleEntity.class));
        }
        return roleEntities;
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
