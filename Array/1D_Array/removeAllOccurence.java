import java.util.Scanner;
public class removeAllOccurence {
    public static int removeOccurences(int[] arr, int size, int value) {
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != value) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter Size of the Array :-> ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be Greater than Zero");
            return;
        }

        int[] arr = new int[size];

        System.out.print("Enter " + size + " Elements :-> ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to remove :-> ");
        int value = scanner.nextInt();

        int newSize = removeOccurences(arr, size, value);


        System.out.print("Update Array :-> ");
        if (newSize > 0) {
            printArray(arr, newSize);
        } else {
            System.out.println("[] (All elements removed)");
        }

        System.out.println("New Size :-> " + newSize);

        scanner.close();
    }
}
