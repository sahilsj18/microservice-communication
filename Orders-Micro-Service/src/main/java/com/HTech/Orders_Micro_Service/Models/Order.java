package com.HTech.Orders_Micro_Service.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
public class Order {
    @Id
    private String orderId; // Use camelCase for variable names
    private String userId;
    private List<String> productIds;
    private  String paymentMode;
    private  String paymentId;

    public Order(String orderId, String userId, List<String> productIds, String paymentMode, String paymentId) {
        this.orderId = orderId;
        this.userId = userId;
        this.productIds = productIds;
        this.paymentMode = paymentMode;
        this.paymentId = paymentId;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
