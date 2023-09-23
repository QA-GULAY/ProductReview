package com.productreview.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
     static {
         try {
             String path="config.properties";

             //dosyayi java diline dondurur veya okur
             FileInputStream input=new FileInputStream(path);

             //verileri dosyadan key-value seklinde yukler
             properties=new Properties();
              properties.load(input);

         }catch(Exception e){
            e.printStackTrace();
         }
     }
 public static String getProperties(String keyName){

         return properties.getProperty(keyName);
 }
}
