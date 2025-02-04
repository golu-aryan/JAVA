import java.util.Scanner;

public class reverseByEven {
    public static void reverseEvenIndices(int[] array) {
        int n = array.length;

        for (int left = 0, right = n - 1; left < right; left += 2, right -= 2) {
            while (right % 2 != 0) {
                right--;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
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

        System.out.print("Enter size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be a Positive integer.");
            return;
        }

        int[] array = new int[size];
        System.out.println("Enter the elements of the Array :-> ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Original Array :-> ");
        printArray(array);

        reverseEvenIndices(array);

        System.out.print("Modified Array :-> ");
        printArray(array);

        scanner.close();
    }
}