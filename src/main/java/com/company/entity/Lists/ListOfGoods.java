package com.company.entity.Lists;

import com.company.entity.Food;
import com.company.entity.Goods;

import java.util.List;

public interface ListOfGoods {

    List<?> getJSONList() throws Exception;
    List<?>getXMLList() throws Exception;

}
