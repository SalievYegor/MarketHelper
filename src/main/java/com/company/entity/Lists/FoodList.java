package com.company.entity.Lists;

import com.company.MyXMLRead;
import com.company.entity.Food;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class FoodList implements ListOfGoods {

    private List<Food>  foodList = new LinkedList<>();

    @Override
    public List<Food> getJSONList() throws Exception {
        //TODO: remove unchecked assigment
        GoodsList gl = new GoodsList();
        foodList = gl.sortingByType(new Food());
        return foodList;
    }

    @Override
    public List<Food> getXMLList() throws Exception {
        Food food = new Food();
        MyXMLRead xmlRead = new MyXMLRead();
        NodeList nodeList = xmlRead.getNodeList("goodsXML");

        for (int temp = 0; temp < nodeList.getLength(); temp++){
            Node nNode = nodeList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) nNode;

                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                food.setName(name);
                String price = eElement.getElementsByTagName("price").item(0).getTextContent();
                double dPrice = Double.parseDouble(price);
                food.setPrice(dPrice);
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                Date ddate = sdf.parse(eElement.getElementsByTagName("deliveryDate").item(0).getTextContent());
                food.setDeliveryDate(ddate);
                Date edate = sdf.parse(eElement.getElementsByTagName("expirationDate").item(0).getTextContent());
                food.setExpirationDate(edate);
                String country = eElement.getElementsByTagName("country").item(0).getTextContent();
                food.setCountry(country);
                String weight = eElement.getElementsByTagName("weight").item(0).getTextContent();
                double dWeight = Double.parseDouble(weight);
                food.setWeight(dWeight);
                foodList.add(food);
            }
        }
       return foodList;
    }


}
