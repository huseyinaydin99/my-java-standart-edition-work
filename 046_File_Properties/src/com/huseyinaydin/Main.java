/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager.fileWrite("dataConfig.properties");
        String arrayValue[] = FileManager.fileRead("dataConfig.properties");
        for (String s : arrayValue) {
            System.out.println(s);
        }
    }

}

class FileManager {

    public FileManager() {
    }

    public static void fileWrite(String fileName) throws FileNotFoundException, IOException {
        if (new File(fileName).exists() == false) {
            Properties properties = new Properties();
            OutputStream outputStream = new FileOutputStream(fileName);
            properties.setProperty("url", "localhost:8080/myDb");
            properties.setProperty("username", "root");
            properties.setProperty("password", "toor");
            properties.store(outputStream, "abc");
        }
    }

    public static String[] fileRead(String fileName) throws FileNotFoundException, IOException {
        if (new File(fileName).exists()) {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream(fileName);
            properties.load(inputStream);
            String array[] = new String[3];
            array[0] = properties.getProperty("username");
            array[1] = properties.getProperty("password");
            array[2] = properties.getProperty("url");
            return array;
        } else {
            throw new MyFileNotFoundException("Dosya bulunamadı!");
        }
    }
}

class MyFileNotFoundException extends FileNotFoundException {

    private String fail;

    public MyFileNotFoundException(String string) {
        super(string);
        this.fail = string;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

}
