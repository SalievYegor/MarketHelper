package com.company.entity.Lists;

import com.company.JsonRead;
import com.company.entity.Goods;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodsList  {

    private JsonRead jr = new JsonRead("food");
    private ObjectMapper mapper = new ObjectMapper();

    private List<Goods> getGoods() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        mapper.setDateFormat(sdf);
        Goods[] goods = mapper.readValue(jr.jsonRead(), Goods[].class);
        return Arrays.asList(goods);
    }

    public List sortingByType(Goods productType) throws Exception{
        List<Goods> sortedList = new ArrayList<Goods>();

        for (Goods sortedGoods : this.getGoods()) {
            if (productType.getClass().equals(sortedGoods.getClass())) {
                sortedList.add(sortedGoods);
            }
        }
        return sortedList;
    }
}
