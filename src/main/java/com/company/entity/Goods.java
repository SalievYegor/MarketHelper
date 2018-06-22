package com.company.entity;

import com.company.JsonRead;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public abstract class Goods {

    private String productName;
    private double productPrice;
    private Date deliveryDate;

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }
    private ObjectMapper mapper = new ObjectMapper();
    private List<Goods> goodsList;
    private String goodsName;

    public List<Goods> getGoodsList(String goodsName){
        JsonRead jr = new JsonRead(this.goodsName = goodsName);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        mapper.setDateFormat(sdf);

        try {
            Goods[] foods = mapper.readValue(jr.jsonRead(), Goods[].class);
            goodsList = Arrays.asList(foods);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return goodsList;
    }

}
