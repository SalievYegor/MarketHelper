package com.company.entity.Lists;

import com.company.JsonRead;
import com.company.entity.Food;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FoodList {

    private List<Food> foodList = new LinkedList<Food>();

    public List<Food> getFoodList() {
        ObjectMapper mapper = new ObjectMapper();
        JsonRead jr = new JsonRead("food");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        mapper.setDateFormat(sdf);

        try {
            Food[] foods = mapper.readValue(jr.jsonRead(), Food[].class );
            foodList = Arrays.asList(foods);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foodList;
    }
    public void showList(){
        for (Food f : this.getFoodList()){
            System.out.println(f.getName());
        }
    }

}
