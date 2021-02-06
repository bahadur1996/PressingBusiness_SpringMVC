package com.example.mapper;

import com.example.domain.Price;
import com.example.entity.PriceEntity;
import com.example.utils.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PriceMapper {
    public Mapper<PriceEntity, Price> entityToDomain(){
        return entity->new Price()
                .setId(entity.getId())
                .setProductName(entity.getProductName())
                .setSize(entity.getSize())
                .setPaperType(entity.getPaperType())
                .setPaperThickness(entity.getPaperThickness())
                .setColor(entity.getColor())
                .setPrice(entity.getPrice())
                .setLaminationRequired(entity.getLaminationRequired())
                .setLaminationType(entity.getLaminationType())
                .setSpotRequired(entity.getSpotRequired())
                .setAirbrushRequired(entity.getAirbrushRequired())
                .setBindingRequired(entity.getBindingRequired());
    }
    public Mapper<Price,PriceEntity> domainToEntity(){
        return domain->new PriceEntity()
                .setId(domain.getId())
                .setProductName(domain.getProductName())
                .setSize(domain.getSize())
                .setPaperType(domain.getPaperType())
                .setPaperThickness(domain.getPaperThickness())
                .setColor(domain.getColor())
                .setPrice(domain.getPrice())
                .setLaminationRequired(domain.getLaminationRequired())
                .setLaminationType(domain.getLaminationType())
                .setSpotRequired(domain.getSpotRequired())
                .setAirbrushRequired(domain.getAirbrushRequired())
                .setBindingRequired(domain.getBindingRequired());
    }

    public List<Price> listEntityToListDomain(List<PriceEntity> productEntities){
        List<Price> products = new ArrayList<>();
        productEntities.stream().forEach(productEntity -> products.add(entityToDomain().map(productEntity)));

        return products;
    }

    public List<PriceEntity> listDomainToListEntity(List<Price> products){
        List<PriceEntity> productEntities = new ArrayList<>();
        products.stream().forEach(product -> productEntities.add(domainToEntity().map(product)));

        return productEntities;
    }
}
