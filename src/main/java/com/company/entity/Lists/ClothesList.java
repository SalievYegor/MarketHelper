package com.company.entity.Lists;

import com.company.entity.Clothes;

import java.util.List;

public class ClothesList implements ListOfGoods {

    public List<Clothes> getList() throws Exception {
        GoodsList gl = new GoodsList();
        List<Clothes> clothesList = gl.sortingByType(new Clothes());
        return clothesList;
    }

}
