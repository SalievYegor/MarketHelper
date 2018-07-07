package com.company.entity;

import com.company.DataStorage.xml.jaxb.DateTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.NONE)
public class Food extends Goods implements IFood {

    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlElement
    private Date expirationDate;

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = java.sql.Date.valueOf(expirationDate);
    }

    public LocalDate getExpirationDate() {
        return expirationDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @Override
    public String toString() {
        return " name: " + getName() + "\n" +
                "price: " + getPrice() + "\n" +
                "weight: " + getWeight() + "\n" +
                "country: " + getCountry() + "\n" +
                "deliveryDate: " + getDeliveryDate() + "\n" +
                "expirationDate: " + expirationDate;
    }
}



