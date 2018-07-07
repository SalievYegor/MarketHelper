package com.company.entity;

import java.time.LocalDate;
import java.util.Date;

public interface IGoods {
    public double getWeight();

    public String getCountry();

    public String getName();

    public double getPrice();

    public LocalDate getDeliveryDate();

    public void setName(String name);

    public void setPrice(double price);

    public void setDeliveryDate(LocalDate deliveryDate);

    public void setCountry(String country);

    public void setWeight(double weight);
}
