package com.soapui.readFile;

import java.io.*;
import java.util.Properties;

public class ReadProperties {

    Properties prop;

    public ReadProperties(String filePath){
        prop = new Properties();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            prop.load(br);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperties(String key){
        return prop.getProperty(key);
    }

}
