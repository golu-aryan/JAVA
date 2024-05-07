import java.util.Scanner;

class A {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];

    void getdata() {
        int i, j;

        Scanner q = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter number a[" + i + "]" + "[" + j + "]: ");
                a[i][j] = q.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter number a[" + i + "]" + "[" + j + "]: ");
                b[i][j] = q.nextInt();
            }
        }
    }

    void add() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }
    }

    void output() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

public class Adding {
    public static void main(String[] args) {
        A a = new A();
        a.getdata();
        a.add();
        a.output();
    }
}
