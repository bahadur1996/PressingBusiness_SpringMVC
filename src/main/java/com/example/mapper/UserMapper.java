package com.example.mapper;

import com.example.domain.User;
import com.example.entity.UserEntity;
import com.example.utils.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {

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
                .setRoles(entity.getRoles());
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
                .setRoles(domain.getRoles());
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
