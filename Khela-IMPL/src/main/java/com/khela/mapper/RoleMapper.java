package com.khela.mapper;

import com.khela.domain.Role;
import com.khela.entity.RoleEntity;
import com.khela.utils.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class RoleMapper {

    private final PrivilegeMapper privilegeMapper;

    public RoleMapper(PrivilegeMapper privilegeMapper) {
        this.privilegeMapper = privilegeMapper;
    }


    public Mapper<RoleEntity, Role> entityToDomain(){
        return entity->new Role()
                .setId(entity.getId())
                .setRoleName(entity.getRoleName())
                .setPrivileges(privilegeMapper.listEntityToListDomain(entity.getPrivilegeEntities()));
    }
    public Mapper<Role,RoleEntity> domainToEntity(){
        return domain->new RoleEntity()
                .setId(domain.getId())
                .setRoleName(domain.getRoleName())
                .setPrivilegeEntities(privilegeMapper.listDomainToListEntity(domain.getPrivileges()));
    }

    public Set<Role> listEntityToListDomain(Set<RoleEntity> productEntities){
        Set<Role> products = new HashSet<>();
        productEntities.stream().forEach(productEntity -> products.add(entityToDomain().map(productEntity)));

        return products;
    }

    public Set<RoleEntity> listDomainToListEntity(Set<Role> products){
        Set<RoleEntity> productEntities = new HashSet<>();
        products.stream().forEach(product -> productEntities.add(domainToEntity().map(product)));

        return productEntities;
    }

}
