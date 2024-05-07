/*write a program that takes two numbers as input and display the product of two numbers */

import java.util.Scanner;

public class product {
    public static void main(String args[]){
        int n1,n2;
        Scanner n = new Scanner(System.in);
        n1 = n.nextInt();
        n2 = n.nextInt();

        int s = n1*n2;
        System.out.println(s);
    }
}
