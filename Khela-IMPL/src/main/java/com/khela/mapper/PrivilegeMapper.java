package com.khela.mapper;

import com.khela.domain.Privilege;
import com.khela.entity.PrivilegeEntity;
import com.khela.utils.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class PrivilegeMapper {

    public Mapper<PrivilegeEntity, Privilege> entityToDomain(){
        return entity->new Privilege()
                .setId(entity.getId())
                .setName(entity.getName());
    }
    public Mapper<Privilege,PrivilegeEntity> domainToEntity(){
        return domain->new PrivilegeEntity()
                .setId(domain.getId())
                .setName(domain.getName());
    }

    public Set<Privilege> listEntityToListDomain(Set<PrivilegeEntity> productEntities){
        Set<Privilege> products = new HashSet<>();
        productEntities.stream().forEach(productEntity -> products.add(entityToDomain().map(productEntity)));

        return products;
    }

    public Set<PrivilegeEntity> listDomainToListEntity(Set<Privilege> products){
        Set<PrivilegeEntity> productEntities = new HashSet<>();
        products.stream().forEach(product -> productEntities.add(domainToEntity().map(product)));

        return productEntities;
    }


}
