package com.example.entity;

import com.example.enumtype.ColorType;
import com.example.enumtype.LaminationType;
import com.example.enumtype.PaperThicknessType;
import com.example.enumtype.PaperType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OrderEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "delivery_date")
    private Date deliveryDate;

    public Long getId() {
        return id;
    }

    public OrderEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public OrderEntity setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OrderEntity setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public OrderEntity setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public OrderEntity setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public OrderEntity setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public OrderEntity setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public OrderEntity setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getSize() {
        return size;
    }

    public OrderEntity setSize(String size) {
        this.size = size;
        return this;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public OrderEntity setPaperType(PaperType paperType) {
        this.paperType = paperType;
        return this;
    }

    public PaperThicknessType getPaperThickness() {
        return paperThickness;
    }

    public OrderEntity setPaperThickness(PaperThicknessType paperThickness) {
        this.paperThickness = paperThickness;
        return this;
    }

    public ColorType getColor() {
        return color;
    }

    public OrderEntity setColor(ColorType color) {
        this.color = color;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderEntity setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public OrderEntity setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Boolean getLaminationRequired() {
        return laminationRequired;
    }

    public OrderEntity setLaminationRequired(Boolean laminationRequired) {
        this.laminationRequired = laminationRequired;
        return this;
    }

    public LaminationType getLaminationType() {
        return laminationType;
    }

    public OrderEntity setLaminationType(LaminationType laminationType) {
        this.laminationType = laminationType;
        return this;
    }

    public Boolean getSpotRequired() {
        return spotRequired;
    }

    public OrderEntity setSpotRequired(Boolean spotRequired) {
        this.spotRequired = spotRequired;
        return this;
    }

    public Boolean getAirbrushRequired() {
        return airbrushRequired;
    }

    public OrderEntity setAirbrushRequired(Boolean airbrushRequired) {
        this.airbrushRequired = airbrushRequired;
        return this;
    }

    public Boolean getBindingRequired() {
        return bindingRequired;
    }

    public OrderEntity setBindingRequired(Boolean bindingRequired) {
        this.bindingRequired = bindingRequired;
        return this;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public OrderEntity setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }
}
