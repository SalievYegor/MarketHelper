package com.company.entity;

public class Clothes extends Goods {
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

