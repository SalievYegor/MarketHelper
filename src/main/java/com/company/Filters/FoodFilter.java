package com.company.Filters;

import com.company.DataStorage.xml.jaxb.ListJaxb;
import com.company.Filters.IFilers.IFoodFilter;
import com.company.entity.ComparableFields.GoodsNameComparator;
import com.company.entity.Lists.FoodList;
import com.company.entity.Food;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.FormatFlagsConversionMismatchException;
import java.util.LinkedList;
import java.util.List;

public class FoodFilter implements IFoodFilter {

    ListJaxb listJaxb = new ListJaxb();
    List<Food> foodList = new LinkedList<>();
    List<Food> filteredList = new LinkedList<>();
    LocalDate date = LocalDate.now();
    GoodsNameComparator gnc = new GoodsNameComparator();
    /*
    Get all food which was delivered 1 month ago till today, and can be expired till next week
   sort it in reverse by name
     */
    public List<Food> filterByDate(){
        foodList.addAll(listJaxb.getFoodList());
        for (Food f : foodList){
            if (f.getExpirationDate().isBefore(date.plusWeeks(1)) && f.getDeliveryDate().isAfter(date.minusMonths(1)))
                filteredList.add(f);
        }
       filteredList.sort(gnc);
       Collections.reverse(filteredList);

        return filteredList;
    }
}
