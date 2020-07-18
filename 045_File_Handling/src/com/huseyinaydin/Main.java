/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\Hüseyin\\Documents\\dosya.txt");
        FileManager.fileWrite(file);
        String value = FileManager.fileRead(file);
        System.out.println(value);
    }
    
}
class FileManager{

    public FileManager() {
    }
    public static void fileWrite(File file) throws FileNotFoundException, IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("Merhaba ben Java");
        dataOutputStream.flush();
        dataOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }
    public static String fileRead(File file) throws FileNotFoundException, IOException{
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        String value = dataInputStream.readUTF();
        fileInputStream.close();
        dataInputStream.close();
        return value;
    }
}
