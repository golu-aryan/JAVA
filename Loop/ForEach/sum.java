//write a program to sum of all elements in array with use of foreach loop

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int q : arr) {
            sum += q;
        }
        System.out.println("The sum of all elements is: " + sum);
        sc.close();
    }
}