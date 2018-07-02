package com.company.entity.Lists;

import com.company.MyXMLRead;
import com.company.entity.Clothes;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ClothesList implements ListOfGoods {
    private List<Clothes> clothesList = new LinkedList<>();

    @Override
    public List<Clothes> getJSONList() throws Exception {
        GoodsList gl = new GoodsList();
        clothesList = gl.sortingByType(new Clothes());
        return clothesList;
    }

    @Override
    public List<?> getXMLList() throws Exception {
        Clothes clothes = new Clothes();
        MyXMLRead xmlRead = new MyXMLRead();
        NodeList nodeList = xmlRead.getNodeList("ClothXML");

        for (int temp = 0; temp < nodeList.getLength(); temp++){
            Node nNode = nodeList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) nNode;

                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                clothes.setName(name);
                String price = eElement.getElementsByTagName("price").item(0).getTextContent();
                double dPrice = Double.parseDouble(price);
                clothes.setPrice(dPrice);
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                Date ddate = sdf.parse(eElement.getElementsByTagName("deliveryDate").item(0).getTextContent());
                clothes.setDeliveryDate(ddate);
                String country = eElement.getElementsByTagName("country").item(0).getTextContent();
                clothes.setCountry(country);
                String weight = eElement.getElementsByTagName("weight").item(0).getTextContent();
                double dWeight = Double.parseDouble(weight);
                clothes.setWeight(dWeight);
                String size = eElement.getElementsByTagName("size").item(0).getTextContent();
                clothes.setSize(size);
                clothesList.add(clothes);
            }
        }
        return clothesList;
    }


}
