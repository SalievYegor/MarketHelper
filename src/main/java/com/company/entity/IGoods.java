package com.company.entity;

import java.util.Date;

public interface IGoods {
    public double getWeight();

    public String getCountry();

    public String getName();

    public double getPrice();

    public Date getDeliveryDate();

    public void setName(String name);

    public void setPrice(double price);

    public void setDeliveryDate(Date deliveryDate);

    public void setCountry(String country);

    public void setWeight(double weight);
}
