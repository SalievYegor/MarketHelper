package com.company;

import com.company.entity.Lists.*;

public class Main {

    public static void main(String[] args) throws Exception {

        ToJsonFile tjf = new ToJsonFile();
        ListOfGoods fl = new FoodList();
        ListOfGoods cl = new ClothesList();
        ListOfGoods kl = new KnivesList();
        tjf.writeToFile(fl.getList(), "foodNew");
        tjf.writeToFile(cl.getList(), "clothNew");
        tjf.writeToFile(kl.getList(), "knifeNew");

    }
}
