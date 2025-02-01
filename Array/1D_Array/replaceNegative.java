import java.util.Scanner;

public class replaceNegative {
    public static void replaceNegativeValuebyZero(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    public static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void getData(int[] arr, int size, Scanner scanner) {
        System.out.println("Enter " + size + " Elements for Array :-> ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " :-> ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.print("Size must be greater than zero!");
            return;
        }
        int[] array = new int[size];

        getData(array, size, scanner);
        replaceNegativeValuebyZero(array, size);
        System.out.print("After Replace Negative by Zero ");
        displayArray(array, size);
        scanner.close();
    }
}