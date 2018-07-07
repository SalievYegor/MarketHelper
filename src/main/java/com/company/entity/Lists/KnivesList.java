package com.company.entity.Lists;

import com.company.DataStorage.xml.dom.MyXMLRead;
import com.company.entity.Knife;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class KnivesList implements ListOfGoods{

    private List<Knife> knivesList = new LinkedList<>();

    public List<?> getJSONList() throws Exception {
        GoodsList gl = new GoodsList();
        knivesList = gl.sortingByType(new Knife());
        return knivesList;
    }

    @Override
    public List<?> getXMLList() throws Exception {
//       Knife knife = new Knife();
//        MyXMLRead xmlRead = new MyXMLRead();
//        NodeList nodeList = xmlRead.getNodeList("knifeXML.xml");
//
//        for (int temp = 0; temp < nodeList.getLength(); temp++){
//            Node nNode = nodeList.item(temp);
//
//            if (nNode.getNodeType() == Node.ELEMENT_NODE){
//                Element eElement = (Element) nNode;
//
//                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
//                knife.setName(name);
//                String price = eElement.getElementsByTagName("price").item(0).getTextContent();
//                double dPrice = Double.parseDouble(price);
//                knife.setPrice(dPrice);
//                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//                Date ddate = sdf.parse(eElement.getElementsByTagName("deliveryDate").item(0).getTextContent());
//                knife.setDeliveryDate(ddate);
//                String country = eElement.getElementsByTagName("country").item(0).getTextContent();
//                knife.setCountry(country);
//                String weight = eElement.getElementsByTagName("weight").item(0).getTextContent();
//                double dWeight = Double.parseDouble(weight);
//                knife.setWeight(dWeight);
//                knivesList.add(knife);
//                String length = eElement.getElementsByTagName("length").item(0).getTextContent();
//                double dLength = Double.parseDouble(length);
//                knife.setLength(dLength);
//                String manufacturer = eElement.getElementsByTagName("manufacturer").item(0).getTextContent();
//                knife.setManufacturer(manufacturer);
//            }
//        }
        return knivesList;
    }

}
