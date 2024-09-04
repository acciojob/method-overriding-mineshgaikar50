package com.driver;


class B extends A {

    public static String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        
        B bObject = new B();
        System.out.println(bObject.meth());

    }
  
}
