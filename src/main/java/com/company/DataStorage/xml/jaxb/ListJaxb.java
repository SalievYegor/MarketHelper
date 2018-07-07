package com.company.DataStorage.xml.jaxb;

import com.company.entity.Clothes;
import com.company.entity.Food;
import com.company.entity.Lists.ClothesList;
import com.company.entity.Lists.FoodList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListJaxb {


    public List<Food> getFoodList() {
        FoodList fl = new FoodList();
        File file = new File("E:\\Download\\loxpidr\\MarketHelper\\src\\resources\\GoodsXML.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(FoodList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            fl = (FoodList) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            System.out.println(e);
        }
        return fl.getFoodList();
    }

    public List<Clothes> getClothesList() {
        ClothesList cl = new ClothesList();
        File file = new File("E:\\Download\\loxpidr\\MarketHelper\\src\\resources\\ClothXML.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(ClothesList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            cl = (ClothesList) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return cl.getClothesList();
    }
}

