import java.util.Scanner;
//write a program to print digits in seperate line one by one
//Ex:--> 124837
//1
//2
//4
//8
//3
//7 like this 

public class printno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digit:");

        int n = sc.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        // System.out.println(nod);

        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);

            n %= div;
            div /= 10;

        }

    }
}