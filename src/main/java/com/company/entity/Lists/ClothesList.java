package com.company.entity.Lists;

import com.company.DataStorage.xml.dom.MyXMLRead;
import com.company.entity.Clothes;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement(name="Cloth")
@XmlAccessorType(XmlAccessType.NONE)
public class ClothesList implements ListOfGoods {
    @XmlElement(name="Product")
    private List<Clothes> clothesList = new LinkedList<>();

    public List<Clothes> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }

    @Override
    public List<Clothes> getJSONList() throws Exception {
        GoodsList gl = new GoodsList();
        clothesList = gl.sortingByType(new Clothes());
        return clothesList;
    }

    @Override
    public List<?> getXMLList() {
//        Clothes clothes = new Clothes();
//        MyXMLRead xmlRead = new MyXMLRead();
//        NodeList nodeList = xmlRead.getNodeList("ClothXML");
//
//        for (int temp = 0; temp < nodeList.getLength(); temp++){
//            Node nNode = nodeList.item(temp);
//
//            if (nNode.getNodeType() == Node.ELEMENT_NODE){
//                Element eElement = (Element) nNode;
//
//                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
//                clothes.setName(name);
//                String price = eElement.getElementsByTagName("price").item(0).getTextContent();
//                double dPrice = Double.parseDouble(price);
//                clothes.setPrice(dPrice);
//                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//                Date ddate = null;
//                try {
//                    ddate = sdf.parse(eElement.getElementsByTagName("deliveryDate").item(0).getTextContent());
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//                clothes.setDeliveryDate(ddate);
//                String country = eElement.getElementsByTagName("country").item(0).getTextContent();
//                clothes.setCountry(country);
//                String weight = eElement.getElementsByTagName("weight").item(0).getTextContent();
//                double dWeight = Double.parseDouble(weight);
//                clothes.setWeight(dWeight);
//                String size = eElement.getElementsByTagName("size").item(0).getTextContent();
//                clothes.setSize(size);
//                clothesList.add(clothes);
//            }
//        }
        return clothesList;
    }

    @Override
    public String toString() {
        return "ClothesList{" +
                "clothesList=" + clothesList +
                '}';
    }
}
