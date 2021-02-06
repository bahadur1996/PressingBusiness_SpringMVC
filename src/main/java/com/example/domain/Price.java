package com.example.domain;

import com.example.enumtype.ColorType;
import com.example.enumtype.LaminationType;
import com.example.enumtype.PaperThicknessType;
import com.example.enumtype.PaperType;

import java.math.BigDecimal;

public class Price {
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

    public Price setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Price setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Price setSize(String size) {
        this.size = size;
        return this;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public Price setPaperType(PaperType paperType) {
        this.paperType = paperType;
        return this;
    }

    public PaperThicknessType getPaperThickness() {
        return paperThickness;
    }

    public Price setPaperThickness(PaperThicknessType paperThickness) {
        this.paperThickness = paperThickness;
        return this;
    }

    public ColorType getColor() {
        return color;
    }

    public Price setColor(ColorType color) {
        this.color = color;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Price setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Boolean getLaminationRequired() {
        return laminationRequired;
    }

    public Price setLaminationRequired(Boolean laminationRequired) {
        this.laminationRequired = laminationRequired;
        return this;
    }

    public LaminationType getLaminationType() {
        return laminationType;
    }

    public Price setLaminationType(LaminationType laminationType) {
        this.laminationType = laminationType;
        return this;
    }

    public Boolean getSpotRequired() {
        return spotRequired;
    }

    public Price setSpotRequired(Boolean spotRequired) {
        this.spotRequired = spotRequired;
        return this;
    }

    public Boolean getAirbrushRequired() {
        return airbrushRequired;
    }

    public Price setAirbrushRequired(Boolean airbrushRequired) {
        this.airbrushRequired = airbrushRequired;
        return this;
    }

    public Boolean getBindingRequired() {
        return bindingRequired;
    }

    public Price setBindingRequired(Boolean bindingRequired) {
        this.bindingRequired = bindingRequired;
        return this;
    }
}
