package com.driver;



public class Main {
    static public class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    static public class B extends A {
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public  static void main(String[] args) {
        
        B bObject = new B();
        System.out.println(bObject.meth());  

    }
  
}
