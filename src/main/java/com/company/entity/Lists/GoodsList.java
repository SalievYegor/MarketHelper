package com.company.entity.Lists;

import com.company.DataStorage.json.JsonRead;
import com.company.entity.Clothes;
import com.company.entity.Goods;
import com.company.entity.Knife;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.company.entity.Food;

public class GoodsList  {

    private JsonRead jr = new JsonRead("food");
    private ObjectMapper mapper = new ObjectMapper();
    private List <Food> foodList = new ArrayList<>();

    public List<Food> getFoodList() {
        return foodList;
    }

    public List<Clothes> getClothesList() {
        return clothesList;
    }

    public List<Knife> getKniveslist() {
        return kniveslist;
    }

    private List <Clothes> clothesList = new ArrayList<>();
    private List <Knife> kniveslist = new ArrayList<>();

    private List<Goods> getGoods() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        mapper.setDateFormat(sdf);
        Goods[] goods = mapper.readValue(jr.jsonRead(), Goods[].class);
        return Arrays.asList(goods);
    }

    public List sortingByType(Goods productType) throws Exception{
        List<Goods> sortedList = new ArrayList<Goods>();

        for (Goods sortedGoods : this.getGoods()) {
            if (productType.getClass().equals(sortedGoods.getClass())) {
                sortedList.add(sortedGoods);
            }
        }
        return sortedList;
    }
//    public void sortedByType() throws IOException {
//        for (Goods goods : this.getGoods() ){
//            if (goods.getType().equals("food")){
//                foodList.add((Food) goods);
//            } else if (goods.getType().equals("clothes")){
//                clothesList.add((Clothes) goods);
//            } else if (goods.getType().equals("knife")){
//                kniveslist.add((Knife) goods);
//            }
//        }

    }
//    public List getSortingByType(Goods productType) throws Exception{
//        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//        mapper.setDateFormat(sdf);
//        Goods[] goods = mapper.readValue(jr.jsonRead(), Goods[].class);
//        List<Goods> sortedList = new ArrayList<Goods>();
//        for (Goods sortedGoods : this.getGoods()) {
//            if (productType.getClass().equals(sortedGoods.getClass())) {
//                sortedList.add(sortedGoods);
//            }
//        }
//        return sortedList;
//    }

