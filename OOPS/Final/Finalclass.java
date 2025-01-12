

final class Ar{
    void display(){
        System.out.println("Base Class");
    }
} 
class B extends Ar{    //A final class cannot be inherited or extend
    void display1(){
        System.out.println("Derived class");
    }
}
public class Finalclass {
    public static void main(String [] args){

        B b = new B();
        b.display();
        b.display1();
    }
}
