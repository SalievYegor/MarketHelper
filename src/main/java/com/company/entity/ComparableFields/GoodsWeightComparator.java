package com.company.entity.ComparableFields;

import com.company.entity.Goods;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;

public class GoodsWeightComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
