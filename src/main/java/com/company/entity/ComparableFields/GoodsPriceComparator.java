package com.company.entity.ComparableFields;

import com.company.entity.Goods;

import java.util.Comparator;

public class GoodsPriceComparator implements Comparator<Goods> {

    public int compare(Goods a, Goods b) {
        return Double.compare(a.getPrice(), b.getPrice());
    }
}
