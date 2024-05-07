
import java.util.Scanner;

class A{
    int a, b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number:");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}
class B extends A{
    void add(){
        System.out.println("Addition is: "+(a+b));
    }
}
class C extends A{
    void subt(){
        System.out.println("Subtraction is :" + (a-b));

    }
}
public class Hierarchy {
    public static void main(String[] args){
       B b = new B();
       b.input();
       b.add();

       C c = new C();
       c.input();
       c.subt();
    }
}
