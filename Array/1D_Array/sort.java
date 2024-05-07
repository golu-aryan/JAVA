import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < 5; i++){
            a[i] = sx.nextInt();
        }
        System.out.println("Sorting your elements☺");
        Arrays.sort(a); //This is method for sorting elements
        for (int s : a) {
            System.out.println(s+"  ");
        }
        sx.close();
    }
}
