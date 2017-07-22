package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

class SaxHandler extends DefaultHandler {

    boolean b_id = false;
    boolean b_name = false;


    @Override
    public void startElement(String uri,
                             String localName, String qName, Attributes attributes)
            throws SAXException {
        /*if (qName.equalsIgnoreCase("Employee"))
        {
            String id = attributes.getValue("Employee");
            System.out.println("Start element: " + id);
        }*/
        if (qName.equalsIgnoreCase("id"))
        {
            b_id = true;
        }
        else if (qName.equalsIgnoreCase("name"))
        {
            b_name = true;
        }
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Employee")) {
            System.out.println("\nEnd Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[],
                           int start, int length) throws SAXException {
        if (b_id) {
            System.out.println("\nID: " + new String(ch, start, length));
            b_id = false;
        }
        else if (b_name)
        {
            System.out.println("Name: " + new String(ch, start, length));
            b_name = false;
        }
    }
}