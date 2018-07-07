package com.company;

import com.company.Filters.ClothFilter;
import com.company.entity.Clothes;
import com.company.entity.Food;
import com.company.Filters.FoodFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
//        ListOfGoods foodList = new ClothesList();
//        List<Clothes> clist = new LinkedList<>();
//        clist.addAll((Collection<? extends Clothes>) foodList.getXMLList());
//
//        for (Clothes f : clist){
//            System.out.println(f);
//        }
//        FoodFilter fl = new FoodFilter();
//        GoodsCountryComparator gpc = new GoodsCountryComparator();
//        List<Food> flist = new LinkedList<>();
//        flist.addAll(fl.filteredByDate());
//        flist.sort(gpc);
//        System.out.println(flist);
        FoodFilter fl = new FoodFilter();
        List<Food> list = new ArrayList<>();
        list.addAll(fl.filterByDate());
        for (Food f : list) {
            System.out.println("this products will expire soon or alrdy expired! WARNING!: " + f.getName() + " expiration date: " + f.getExpirationDate());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("write maximum price u wish: ");
        double price = sc.nextDouble();
        System.out.println("write country what u want items from it: ");
        String country = sc.next();
        ClothFilter cf = new ClothFilter();
        List<Clothes> clothesList = new ArrayList<>();
        clothesList.addAll(cf.filterPriceNCountry(price, country));
        for (Clothes c : clothesList){
            System.out.println("items: " + c.getName() + " for price less than: " + c.getPrice() + " from country: " + c.getCountry());
        }
    }
}
