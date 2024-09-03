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
        // Task 3: Call the method from class A using an object of class B
        B bObject = new B();
        System.out.println(bObject.meth()); // Output: Invoking method from class A

        // Task 5: Call the overridden method from class B
        System.out.println(bObject.meth()); // Output: Method is overridden in Extended class B
    }
  
}
