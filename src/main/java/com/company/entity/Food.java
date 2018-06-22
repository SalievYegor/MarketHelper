package com.company.entity;

import com.company.JsonRead;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Food extends Goods {

    private double foodWeight;
    private Date expirationDate;
    private List<Goods> foodList = new LinkedList<Goods>();
    private ObjectMapper mapper = new ObjectMapper();

    public double getFoodWeight() {
        return foodWeight;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void foodPring(){
    foodList = super.getGoodsList("food");
        for (Goods food : foodList){
            System.out.println(getProductName() + " " + getFoodWeight() +
                    " " + getProductPrice() + " " + getExpirationDate() +
                    " " + getDeliveryDate());

        }
    }
}
