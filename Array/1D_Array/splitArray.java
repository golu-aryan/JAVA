import java.util.Scanner;

public class splitArray {
    public static int[] swapHalves(int[] arr, int size) {
        int[] result = new int[size];
        int mid = (size + 1) / 2;

        for (int i = 0; i < size - mid; i++) {
            result[i] = arr[mid + i];
        }
        for (int i = 0; i < mid; i++) {
            result[size - mid + i] = arr[i];
        }
        return result;
    }

    public static void displayArray(int[] arr, int size) {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Input! Size must be Greater than zero");
            return;
        }

        int[] originalArray = new int[size];
        int[] modifiedArray = new int[size];
        System.out.println("Enter " + size + " Elements for Array :-> ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " :-> ");
            originalArray[i] = scanner.nextInt();
        }

        System.out.print("Original Array :-> ");
        displayArray(originalArray, size);

        modifiedArray = swapHalves(originalArray, size);

        System.out.print("After Swaping Halves Array :-> ");
        displayArray(modifiedArray, size);

        scanner.close();
    }
}