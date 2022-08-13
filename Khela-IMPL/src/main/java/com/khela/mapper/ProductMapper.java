package com.khela.mapper;

import com.khela.domain.Product;
import com.khela.entity.ProductEntity;
import com.khela.utils.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {

    public Mapper<ProductEntity, Product> entityToDomain(){
        return entity->new Product()
                .setId(entity.getId())
                .setDescription(entity.getDescription())
                .setProductName(entity.getProductName())
                .setPrice(entity.getPrice());
    }
    public Mapper<Product,ProductEntity> domainToEntity(){
        return domain->new ProductEntity()
                .setId(domain.getId())
                .setDescription(domain.getDescription())
                .setProductName(domain.getProductName())
                .setPrice(domain.getPrice());
    }

    public List<Product> listEntityToListDomain(List<ProductEntity> productEntities){
        List<Product> products = new ArrayList<>();
        productEntities.stream().forEach(productEntity -> products.add(entityToDomain().map(productEntity)));

        return products;
    }

    public List<ProductEntity> listDomainToListEntity(List<Product> products){
        List<ProductEntity> productEntities = new ArrayList<>();
        products.stream().forEach(product -> productEntities.add(domainToEntity().map(product)));

        return productEntities;
    }

}
