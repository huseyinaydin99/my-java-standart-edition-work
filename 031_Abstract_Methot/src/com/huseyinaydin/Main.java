/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

/**
 *
 * @author Hüseyin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        PhoneRepair phoneRepair = new PhoneRepair();
        phoneRepair.repair(iphone);
        Phone phone = new Phone() {
            @Override
            void cell() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            void camera() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        phone.cell();
        Wood<String> wood = new Wood<String>() {
            @Override
            void wood(String t) {
                System.out.println(t);
            }
        };
        wood.wood("Merhaba");
    }
    
}
class PhoneRepair{
    public void repair(Phone phone){
        System.out.println("Tamir edildi");
    }
}
abstract class Phone{
    abstract void cell();
    abstract void camera();
}
abstract class Wood<T>{
    abstract void wood(T t);
}
class Iphone extends Phone{

    @Override
    void cell() {
        
    }

    @Override
    void camera() {
        
    }
}