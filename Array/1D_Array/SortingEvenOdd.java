import java.util.Arrays;
import java.util.Scanner;

public class SortingEvenOdd {

    public static void displayArray(int[] original, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] original, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (original[i] > original[j]) {
                    int temp = original[i];
                    original[i] = original[j];
                    original[j] = temp;
                }
            }
        }
    }

    public static void seperateOddEven(int[] original, int size) {
        int[] odd = new int[size];
        int[] even = new int[size];
        int o = 0, e = 0;

        for (int i = 0; i < size; i++) {
            if (original[i] % 2 == 0) {
                even[e++] = original[i];
            } else {
                odd[o++] = original[i];
            }
        }
        sortArray(odd, o);
        displayArray(odd, o);

        sortArray(even, e);
        displayArray(even, e);
    }

    public static void inputData(Scanner scanner) {
        int size;
        System.out.print("Enter the size of the Array :-> ");
        size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Sry! Size must be Greater than zero");
            return;
        }

        int[] original = new int[size];

        System.out.println("Enter " + size + " Elements :-> ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + ":-> ");
            original[i] = scanner.nextInt();
        }
        displayArray(original, size);
        seperateOddEven(original, size);

        sortArray(original, size);
        displayArray(original, size);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputData(scanner);
        scanner.close();
    }
}