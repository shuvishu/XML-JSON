package com.company;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONParserClass {
    public static void main(String[] args) {
        org.json.simple.parser.JSONParser jsonParser= new org.json.simple.parser.JSONParser();
        try {
            Object obj=jsonParser.parse(new FileReader("src/com/company/Employee.json"));


            JSONArray jsonArray=(JSONArray)obj;
            for (Object o:jsonArray) {
                JSONObject j=(JSONObject)o;
                System.out.println(j.toString() );
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
