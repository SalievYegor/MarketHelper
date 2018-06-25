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
}
