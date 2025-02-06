import java.util.Scanner;

public class sumofNeighbor {
    public static int[] calculatedModifiedArray(int[] arr, int size) {
        int[] modifiedArray = new int[size];

        for (int i = 0; i < size; i++) {
            int left = (i == 0) ? 0 : arr[i - 1]; // Left neighbor or 0
            int right = (i == size - 1) ? 0 : arr[i + 1];
            modifiedArray[i] = left + right;
        }
        return modifiedArray;
    }

    public static void displayArray(int[] arr, String message) {
        System.out.print(message + ":-> [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be greater than 0!");
            return;
        }

        int[] originalArray = new int[size];

        System.out.println("Enter elements :-> ");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        displayArray(originalArray, "Orignal Array");

        int[] modifiedArray = calculatedModifiedArray(originalArray, size);

        displayArray(modifiedArray, "Modified Array");

        scanner.close();
    }
}
