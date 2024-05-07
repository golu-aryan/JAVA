import java.util.Scanner;

public class iteratingarray {
    public static void main(String[] args) {
        int size, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter array size:");
        size = r.nextInt();
        System.out.println("Enter Array elements:");
        int[] arr = new int[size];
        for (i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }
        System.out.println("Array elements are:");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        r.close();
    }
}