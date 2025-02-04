import java.util.Scanner;

public class differenceofLargestSmallest {

    public static int find_Largest(int[] arr, int size) {
        int largest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {

                largest = arr[i];
            }
        }
        return largest;
    }

    public static int find_Smallest(int[] arr, int size) {
        int smallest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int size;
        System.out.print("Enter size of Array :-> ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Input! Size must be Greater than 0");
            return;
        }

        int[] array = new int[size];
        System.out.println("Enter " + size + " Elements :-> ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " :-> ");
            array[i] = scanner.nextInt();
        }

        int largest = find_Largest(array, size);

        int smallest = find_Smallest(array, size);

        int difference = largest - smallest;

        System.out.println("Largest number is :-> " + largest);
        System.out.println("Smallest number is :-> " + smallest);
        System.out.println("The difference between Largest and Smallest is :-> " + difference);

        scanner.close();
    }
}
