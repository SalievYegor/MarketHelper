package com.company.entity;

public class Clothes extends Goods {
    private int clothSize;
    private String color;
    private String brandName;

    public String getColor() {
        return color;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getClothSize() {

        return clothSize;
    }


    @Override
    public void print() {
        
    }
}
