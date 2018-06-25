package com.company.entity.Lists;

import com.company.entity.Goods;

import java.util.List;

/**
 * Created by Halvasan on 25.06.2018.
 */
public interface ListOfGoods {

    List<? extends Goods> getList() throws Exception;
}
