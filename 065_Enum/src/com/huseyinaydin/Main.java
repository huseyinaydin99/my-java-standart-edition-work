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
        System.out.println(Phone.APPLE + " - " + Phone.SAMSUNG + " - " + Phone.HTC);
        Phone p = Phone.HTC;
        switch (p) {
            case APPLE:
                System.out.println("Apple");
                break;
            case SAMSUNG:
                System.out.println("Samsung");
                break;
            case HTC:
                System.out.println("Htc");
                break;
            default:
                System.out.println("Hiçbiri");
                break;
        }
        System.out.println("price " + Phone.APPLE.getPrice());
        System.out.println("ordinal " + Phone.SAMSUNG.ordinal());
        Phone p1[] = Phone.values();
        for (Phone phone : p1) {
            System.out.println(phone);
            phone.show();
        }
    }

}
@FunctionalInterface
interface Demo1{
    public void show();
}
enum Phone implements Demo1{
    APPLE(100), SAMSUNG(92), HTC(80);
    int price;

    private Phone(int price) {
        this.price = price;
    }

    private Phone() {
        this.price = 80;
    }

    @Override
    public String toString() {
        return "Phone{" + "price=" + price + '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void show() {
        System.out.println("Selam");
    }
    
    
    
}
