import java.util.Scanner;
public class AlternateNegPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements :-> ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements for Array :-> ");
        for (int i = 0; i <n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[p++] = arr[i];
            } else if (arr[i] < 0) {
                neg[q++] = arr[i];
            }
        }

        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        while (i < p) {
            arr[k++] = pos[i++];
        }

        while (j < q) {
            arr[k++] = neg[j++];
        } 

        System.out.println("Rearranged Array :-> ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        scanner.close();
    }
}
