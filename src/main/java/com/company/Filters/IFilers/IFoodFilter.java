package com.company.Filters.IFilers;

import com.company.entity.Food;

import java.util.List;

public interface IFoodFilter extends IShopFilter {
    public List<Food> filterByDate();

}
