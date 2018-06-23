package com.company.entity;


import com.company.entity.Lists.FoodList;

import java.util.Date;

public class Food extends Goods{

    private double weight;
    private Date expirationDate;

    public double getWeight() {
        return weight;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void print() {
        FoodList fl = new FoodList();
        for (Food food : fl.getFoodList()){
            System.out.println("Food name: " + food.getName() + "\n" + "price: " +
            food.getPrice() + " \n"  + "weight: " +  food.getWeight() + "\n" +
            "delivery date: " + food.getDeliveryDate() + "\n" + "expiration date: " + food.getExpirationDate());
        }
    }
}


