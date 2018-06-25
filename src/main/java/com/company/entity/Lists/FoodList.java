package com.company.entity.Lists;

import com.company.entity.Food;

import java.util.List;

public class FoodList implements ListOfGoods{

    public List<Food> getList() throws Exception {
        GoodsList gl = new GoodsList();
        List <Food> foodList = gl.sortingByType(new Food());
        return foodList;
    }
}
