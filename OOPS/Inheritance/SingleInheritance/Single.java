

import java.util.Scanner;

class A{
    int a,b;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        a = sc.nextInt();
        b = sc.nextInt();
    
    }
    void add(){
        System.out.println("Addition = " + (a+b));
    }
}

class B extends A{
    int c;
    void getdata(){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number :");
        c = n.nextInt();
        n.close();
    }
    void display(){
        System.out.println("Addition = "+ (a+b+c));
    }
}
public class Single {
     public static void main(String [] args){
        // A q = new A();
        // q.input();
        // q.add();

        B w = new B();
        w.input();
        w.add();
        w.getdata();
        w.display();

     }
}
