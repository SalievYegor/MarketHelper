package com.company.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement (name = "Product")
@XmlAccessorType(XmlAccessType.NONE)
public class Clothes extends Goods {
    @XmlElement
    private String size;

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +  "name: " + getName() + "\n" +
                "price: " + getPrice() + "\n" +
                "weight: " + getWeight() + "\n" +
                "country: " + getCountry() + "\n" +
                "deliveryDate: " + getDeliveryDate() + "\n";
    }
}

