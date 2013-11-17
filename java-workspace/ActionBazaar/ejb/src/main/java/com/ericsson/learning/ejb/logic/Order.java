package com.ericsson.learning.ejb.logic;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private Long id;
    private Long bidderId;
    private List<Long> items;
    private ShippingInfo shippingInfo;
    private BillingInfo billingInfo;
    private OrderStatus status;

    public Long getOrderId() {
        return 1000l;
    }

    public void setOrderId(Long id) {
        this.id = id;
    }

    public Long getBidderId() {
        return bidderId;
    }

    public void setBidderId(Long bidderId) {
        this.bidderId = bidderId;
    }

    public List<Long> getItems() {
        return items;
    }

    public void setItems(List<Long> items) {
        this.items = items;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
