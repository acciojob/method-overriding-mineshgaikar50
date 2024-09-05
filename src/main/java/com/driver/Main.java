class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

 class Main {
     public static void main(String[] args) {
        B b = new B();

        // Calling method from class A using object of class B
        System.out.println(b.meth());
    }
}
