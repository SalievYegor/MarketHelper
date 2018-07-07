package com.company.entity;

import com.company.DataStorage.xml.jaxb.DateTimeAdapter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.ZoneId;
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
@XmlAccessorType(XmlAccessType.NONE)
public abstract class Goods implements IGoods {
    @XmlElement
    private String name;
    @XmlElement
    private double price;
    @XmlElement
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private Date deliveryDate;
    @XmlElement
    private String country;
    @XmlElement
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

    public LocalDate getDeliveryDate() {
        return deliveryDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = java.sql.Date.valueOf(deliveryDate);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", deliveryDate=" + deliveryDate +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
