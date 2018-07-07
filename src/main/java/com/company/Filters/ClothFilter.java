package com.company.Filters;

import com.company.DataStorage.xml.jaxb.ListJaxb;
import com.company.Filters.IFilers.IClothFilter;
import com.company.entity.Clothes;
import com.company.entity.ComparableFields.GoodsNameComparator;
import com.company.entity.Food;
import com.company.entity.Lists.ClothesList;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClothFilter implements IClothFilter {
    ListJaxb listJaxb = new ListJaxb();
    List<Clothes> foodList = new LinkedList<>();
    List<Clothes> filteredList = new LinkedList<>();
    LocalDate date = LocalDate.now();
    GoodsNameComparator gnc = new GoodsNameComparator();

    public List<Clothes> filterPriceNCountry(double price, String country){
        foodList.addAll(listJaxb.getClothesList());
        for (Clothes c : foodList){
            if (c.getPrice() <= price && c.getCountry().equals(country))
                filteredList.add(c);
        }
        filteredList.sort(gnc);
        return filteredList;
    }
}
