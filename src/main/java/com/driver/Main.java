package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Aayush";
//        System.out.println(obj.name);
        //error message: name has private access in com.driver.RWOnly

        obj.setName("Aayush");
        System.out.println(obj.getName());
    }
}