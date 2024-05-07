import java.util.Scanner;

public class para {
    int a, b;

    para(int x, int y) {
        a = x;
        b = y;
    }

    void output() {
        int c;
        c = a + b;
        System.out.println("a + b = " + c);
    }
    public static void main(String[] args) {
        int z,q;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the two number:");
        z = t.nextInt();
        q = t.nextInt();
        para p = new para(z,q);
        p.output();

        t.close(); 
    }
}
