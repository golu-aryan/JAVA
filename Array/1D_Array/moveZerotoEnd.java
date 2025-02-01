import java.util.Scanner;

public class moveZerotoEnd {

    public static void moveZero(int[] arr, int size) {
        int nonZeroIndex = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void displayArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of Array :->");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Input! Size must be Greater than zero");
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter the elements of the Array :-> ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array :-> ");
        displayArray(arr, size);

        moveZero(arr, size);

        System.out.print("Array After moving zeros to the end :-> ");
        displayArray(arr, size);

        scanner.close();
    }
}
