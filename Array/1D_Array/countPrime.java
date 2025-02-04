import java.util.Scanner;

public class countPrime {

    public static int primeCounter(int[] arr, int size) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getData(int[] arr, int size, Scanner scanner) {
        System.out.println("Enter " + size + " Elements for Array :-> ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " :-> ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter size of the Array :-> ");
        size = scanner.nextInt();

        int[] array = new int[size];

        getData(array, size, scanner);
        System.out.println("Original Array :-> ");
        displayArray(array, size);
        int count = primeCounter(array, size);
        System.out.println(count);

        scanner.close();
    }
}
