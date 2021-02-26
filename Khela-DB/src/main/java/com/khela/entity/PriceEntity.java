package com.khela.entity;

import com.khela.enumtype.ColorType;
import com.khela.enumtype.LaminationType;
import com.khela.enumtype.PaperThicknessType;
import com.khela.enumtype.PaperType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "price",schema = "public")
public class PriceEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String productName;

    private String size;

    private PaperType paperType;

    private PaperThicknessType paperThickness;

    private ColorType color;

    private BigDecimal price;

    private Boolean laminationRequired;

    private LaminationType laminationType;

    private Boolean spotRequired;

    private Boolean airbrushRequired;

    private Boolean bindingRequired;

    public Long getId() {
        return id;
    }

    public PriceEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public PriceEntity setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getSize() {
        return size;
    }

    public PriceEntity setSize(String size) {
        this.size = size;
        return this;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public PriceEntity setPaperType(PaperType paperType) {
        this.paperType = paperType;
        return this;
    }

    public PaperThicknessType getPaperThickness() {
        return paperThickness;
    }

    public PriceEntity setPaperThickness(PaperThicknessType paperThickness) {
        this.paperThickness = paperThickness;
        return this;
    }

    public ColorType getColor() {
        return color;
    }

    public PriceEntity setColor(ColorType color) {
        this.color = color;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public PriceEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Boolean getLaminationRequired() {
        return laminationRequired;
    }

    public PriceEntity setLaminationRequired(Boolean laminationRequired) {
        this.laminationRequired = laminationRequired;
        return this;
    }

    public LaminationType getLaminationType() {
        return laminationType;
    }

    public PriceEntity setLaminationType(LaminationType laminationType) {
        this.laminationType = laminationType;
        return this;
    }

    public Boolean getSpotRequired() {
        return spotRequired;
    }

    public PriceEntity setSpotRequired(Boolean spotRequired) {
        this.spotRequired = spotRequired;
        return this;
    }

    public Boolean getAirbrushRequired() {
        return airbrushRequired;
    }

    public PriceEntity setAirbrushRequired(Boolean airbrushRequired) {
        this.airbrushRequired = airbrushRequired;
        return this;
    }

    public Boolean getBindingRequired() {
        return bindingRequired;
    }

    public PriceEntity setBindingRequired(Boolean bindingRequired) {
        this.bindingRequired = bindingRequired;
        return this;
    }
}
