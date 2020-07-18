/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int a = 0, b, c;
        b = 0;
        c = 2;
        int array[] = new int[4];
        try {
            for (int i = 0; i <= array.length; i++) {
                array[i] = i + 1;
            }
            x = bufferedReader.read();
            a = c / b;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally{
            //bufferedReader.close();
            System.out.println("Bye");
        }
        
        /*try(BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in))){
            int y = bufferedReader2.read();
            bufferedReader2.close();
        }
        catch(IOException e){
            System.out.println(e);
            
        }*/
        
        System.out.println("Sayı gir");
        
        int num = Integer.parseInt(bufferedReader.readLine());
        if(num == 10)
            throw new ArithmeticException("Hata");
        else if(num > 20)
            throw new LongNumberException("20 den büyük sayı girme");
    }

}
class LongNumberException extends ArithmeticException{
    private String fail;
    public LongNumberException() {
    }

    public LongNumberException(String string) {
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
