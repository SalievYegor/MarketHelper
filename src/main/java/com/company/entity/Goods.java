package com.company.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Date;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Food.class, name = "food"),
        @JsonSubTypes.Type(value = Clothes.class, name = "clothes"),
        @JsonSubTypes.Type(value = Knife.class, name = "knife")
})
public abstract class Goods implements IGoods {

    private String name;
    private double price;
    private Date deliveryDate;
    private String country;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
