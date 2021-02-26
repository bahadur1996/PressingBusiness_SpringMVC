package com.khela.domain;


import com.khela.enumtype.ColorType;
import com.khela.enumtype.LaminationType;
import com.khela.enumtype.PaperThicknessType;
import com.khela.enumtype.PaperType;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long id;

    private Long customerId;

    private String customerName;

    private String customerEmail;

    private String customerMobile;

    private String customerAddress;

    private Long productId;

    private String productName;

    private String size;

    private PaperType paperType;

    private PaperThicknessType paperThickness;

    private ColorType color;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Boolean laminationRequired;

    private LaminationType laminationType;

    private Boolean spotRequired;

    private Boolean airbrushRequired;

    private Boolean bindingRequired;

    private Date deliveryDate;

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Order setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Order setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Order setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public Order setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Order setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public Order setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Order setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getSize() {
        return size;
    }

    public Order setSize(String size) {
        this.size = size;
        return this;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public Order setPaperType(PaperType paperType) {
        this.paperType = paperType;
        return this;
    }

    public PaperThicknessType getPaperThickness() {
        return paperThickness;
    }

    public Order setPaperThickness(PaperThicknessType paperThickness) {
        this.paperThickness = paperThickness;
        return this;
    }

    public ColorType getColor() {
        return color;
    }

    public Order setColor(ColorType color) {
        this.color = color;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Order setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Order setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Boolean getLaminationRequired() {
        return laminationRequired;
    }

    public Order setLaminationRequired(Boolean laminationRequired) {
        this.laminationRequired = laminationRequired;
        return this;
    }

    public LaminationType getLaminationType() {
        return laminationType;
    }

    public Order setLaminationType(LaminationType laminationType) {
        this.laminationType = laminationType;
        return this;
    }

    public Boolean getSpotRequired() {
        return spotRequired;
    }

    public Order setSpotRequired(Boolean spotRequired) {
        this.spotRequired = spotRequired;
        return this;
    }

    public Boolean getAirbrushRequired() {
        return airbrushRequired;
    }

    public Order setAirbrushRequired(Boolean airbrushRequired) {
        this.airbrushRequired = airbrushRequired;
        return this;
    }

    public Boolean getBindingRequired() {
        return bindingRequired;
    }

    public Order setBindingRequired(Boolean bindingRequired) {
        this.bindingRequired = bindingRequired;
        return this;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Order setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }
}
