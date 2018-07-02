package com.company;

import com.company.Filters.FoodFilter;
import com.company.Filters.IFilers.IFoodFilter;
import com.company.entity.Clothes;
import com.company.entity.ComparableFields.GoodsPriceComparator;
import com.company.entity.Goods;
import com.company.entity.IFood;
import com.company.entity.Lists.*;
import com.company.entity.Food;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

//        ToJsonFile tjf = new ToJsonFile();
//        ListOfGoods fl = new FoodList();
//        ListOfGoods cl = new ClothesList();
//        ListOfGoods kl = new KnivesList();
//        tjf.writeToFile(fl.getList(), "foodNew");
//        tjf.writeToFile(cl.getList(), "clothNew");
//        tjf.writeToFile(kl.getList(), "knifeNew");
//
//        GoodsPriceComparator gpc = new GoodsPriceComparator();
//        FoodList fl = new FoodList();
//        List<Food> list = new ArrayList<>();
//        list.addAll(fl.getJSONList());
//
//        for (Food food : list) {
//            System.out.println(food.getPrice() + " before sorting");
//        }
//        list.sort(gpc);
//        for (Food food2 : list){
//            System.out.println(food2.getPrice() + " after sorting");
//        }
        ListOfGoods foodList = new ClothesList();
        foodList.getXMLList();
        List<Clothes> clist = new LinkedList<>();
        clist.addAll((Collection<? extends Clothes>) foodList.getXMLList());

        for (Clothes f : clist){
            System.out.println(f);
        }
    }
}
