
//Write a program to print span of input number mean differences of maximum value and minimum value.
import java.util.*;

public class Span {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = n.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = n.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum value of the array is :" + max);
        System.out.println("The minimum value of the array is :" + min);
        
        int span = max - min;
        System.err.println("The span is :-->" + span);
    }
}