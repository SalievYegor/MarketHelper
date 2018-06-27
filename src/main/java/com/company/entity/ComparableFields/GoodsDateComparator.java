package com.company.entity.ComparableFields;

import com.company.entity.Goods;

import java.util.Comparator;

public class GoodsDateComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getDeliveryDate().compareTo(o2.getDeliveryDate());
    }
}
