class A {
    void show() {   //If we add Final keyword in first line of the method then it will not be overriden

        System.out.println("Welcome to the tech field");
    }
}

class B extends A {
    void show() {
        System.out.println("WElcome to Derived class");
    }
}

public class methodoverriding {
    public static void main() {
        B a = new B();
        a.show();
    }
}
