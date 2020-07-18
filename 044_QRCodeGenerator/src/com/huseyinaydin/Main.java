/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String details = "Hüseyin Aydın | Yaş 25 | Kilo 100";
        /*QRCode qRCode = QRCode.from(details);
        QRCode qRCode1 = qRCode.to(ImageType.JPG);
        qRCode1.stream();*/
        ByteArrayOutputStream byteArrayOutputStream = QRCode.from(details).to(ImageType.JPG).stream();
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        File file = new File("C:\\QRCode\\generate.JPG");
        File file2 = new File("C:\\QRCode\\");
        if(!file2.exists())
            file2.mkdir();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
