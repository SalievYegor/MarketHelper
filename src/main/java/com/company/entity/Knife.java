package com.company.entity;

public class Knife extends Kitchen {

    private double length;
    private String manufacturer;

    public Knife(){}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return "Knife{" +
                "length=" + length +
                ", manufacturer='" + manufacturer + '\'' +
                "name: " + getName() + "\n" +
                "price: " + getPrice() + "\n" +
                "weight: " + getWeight() + "\n" +
                "country: " + getCountry() + "\n" +
                "deliveryDate: " + getDeliveryDate() + "\n" ;
    }
}
