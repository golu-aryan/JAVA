import java.util.Scanner;

public class parameterizeconst {
    int a, b;

    parameterizeconst() {
        a = 0;
        b = 2;
    }

    // that is constructor overloading
    parameterizeconst(int x, int y) {
        a = x;
        b = y;
    }

    void input() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = n.nextInt();
        System.out.println("Enter second number:");
        b = n.nextInt();
    }

    void display(){
        System.out.println("A:"+a+"B:"+b);
    }

    void sum() {
        int c;
        c = a + b;
        System.out.println("sum:" + c);
    }

    public static void main(String[] args) {
        parameterizeconst q = new parameterizeconst(); //this called default constructor because of no parameter
        q.input(); //this for default constructor
        q.display();
        q.sum();
        parameterizeconst w = new parameterizeconst(2,4);   //this called parameterized constructor because of parameter
        w.display();
        w.sum();
    }
}
