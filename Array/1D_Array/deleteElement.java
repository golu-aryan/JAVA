import java.util.Scanner;

public class deleteElement {
    public static int[] elementDelete(int[] array, int position) {
        int size = array.length;
        int[] newArray = new int[size - 1];

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != position - 1)
                newArray[j++] = array[i];
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.print("Array size must be a positive integer");
            return;
        }

        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements :-> ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter position of Element to delete (1 to " + size + ") :-> ");
        int position = scanner.nextInt();

        if (position < 1 || position > size) {
            System.out.println("Invalid Position! Please enter Position between 1 and " + size + "");
            return;
        }

        arr = elementDelete(arr, position);

        System.out.println("Updated Array after Deleting element at position " + position + "");
        printArray(arr);

        scanner.close();
    }
}
