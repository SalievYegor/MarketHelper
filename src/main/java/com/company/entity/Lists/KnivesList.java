package com.company.entity.Lists;

import com.company.entity.Knife;

import java.util.List;

public class KnivesList implements ListOfGoods{
    public List<Knife> getList() throws Exception {
        GoodsList gl = new GoodsList();
        List <Knife> knivesList = gl.sortingByType(new Knife());
        return knivesList;
    }
}
