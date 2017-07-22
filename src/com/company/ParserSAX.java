package com.company;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;


class ParserSAX {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser=factory.newSAXParser();
            SaxHandler handler = new SaxHandler();
            saxParser.parse(ClassLoader.getSystemResourceAsStream("com/company/Employee.xml"), handler);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
