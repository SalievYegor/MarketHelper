package com.company.entity;

import java.util.Date;


public abstract class Goods {

    private String name;
    private double price;
    private Date deliveryDate;


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public abstract void print();

}
