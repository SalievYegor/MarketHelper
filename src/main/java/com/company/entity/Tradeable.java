package main.java.com.company.entity;

import java.util.Date;

public abstract class Tradeable {

    private String productName;
    private double productPrice;
    private Date deliveryDate;

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

}
