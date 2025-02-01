import java.util.Scanner;
import java.util.Arrays;

public class medianOfArray {
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);

        int size = arr.length;

        if (size % 2 == 1) {
            return arr[size / 2];
        } else {
            int mid1 = arr[(size / 2) - 1];
            int mid2 = arr[size / 2];
            return (mid1 + mid2) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.print("Invalid Input! Size must be Greater than zero");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements of the array ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " :-> ");
            arr[i] = scanner.nextInt();
        }

        findMedian(arr);

        double median = findMedian(arr);
        System.out.println("Median of the Array is :-> " + median);

        scanner.close();
    }
}