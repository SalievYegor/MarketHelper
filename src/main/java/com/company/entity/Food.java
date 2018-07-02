package com.company.entity;

import java.util.Date;

public class Food extends Goods implements IFood {

    private Date expirationDate;

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "price: " + getPrice() + "\n" +
                "weight: " + getWeight() + "\n" +
                "country: " + getCountry() + "\n" +
                "deliveryDate: " + getDeliveryDate() + "\n" +
                "expirationDate: " + expirationDate;
    }
}



