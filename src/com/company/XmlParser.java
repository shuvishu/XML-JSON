package com.company;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;


public class XmlParser {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbfactory.newDocumentBuilder();

            Document document = builder.parse("src/com/company/Employee.xml");
            document.getDocumentElement().normalize();

            //Root element
            System.out.println("\n Root : " + document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("Employee");

            for (int temp = 0; temp < nodeList.getLength(); temp++) {
                Node node = nodeList.item(temp);
                System.out.println("\nCurrent Element :" + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Employee ID: " + element.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Employee Name : " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("location : " + element.getElementsByTagName("location").item(0).getTextContent());


                }

            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}