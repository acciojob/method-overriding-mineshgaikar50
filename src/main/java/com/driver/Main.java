package com.driver;


class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        
        B bObject = new B();
        System.out.println(bObject.meth());   
       
    }
  
}
