package com.company.DataStorage.xml.dom;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class MyXMLRead {

    /*
    using DOM parsing
     */
    private NodeList nodeList;

    public NodeList getNodeList(String xmlFileName) {
        File xmlFile = new File("E:\\Download\\loxpidr\\MarketHelper\\src\\resources\\" + xmlFileName + ".xml");
        try {
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            Node root = doc.getDocumentElement();
            nodeList = root.getChildNodes();
        } catch (Exception e){
            e.printStackTrace();
        }
        return nodeList;

    }
}
