package com.qacart.todo.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties loadproperties(String filepath){
        File file =new File(filepath);
        try {
            InputStream inputStream=new FileInputStream(file);
            Properties properties =new Properties();
            properties.load(inputStream);
            return properties;

        } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public static void main(String[] args) {
      Properties pro = loadproperties("src/test/java/com/qacart/todo/config/production.properties");
        System.out.println(pro.getProperty("baseUrl"));
    }
}