package main.java.com.company.entity;

import java.util.Date;

public class Food extends Tradeable {
    private double foodWeight;
    private Date expirationDate;

    public double getFoodWeight() {
        return foodWeight;
    }


    public Date getExpirationDate() {
        return expirationDate;
    }

}
