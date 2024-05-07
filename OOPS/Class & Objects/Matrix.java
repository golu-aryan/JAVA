import java.util.Scanner;

//Write a program to print transpose of 2D array elements 
class Matrices {
    int a[][] = new int[3][3];

    void getdata() {
        Scanner n = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Array elements" + "   ");
                a[i][j] = n.nextInt();
            }
            System.out.println();
        }
        n.close();
    }

    void putdata() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + "    ");
            }
            System.out.println();
        }
    }
}

public class Matrix {
    public static void main(String[] args) {
        Matrices m = new Matrices();
        m.getdata();
        System.out.println("Original Matrices:");
        m.putdata();
        m.transpose();
    }
}
