
import java.util.Arrays;

public class sortingarray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 7, 3, 9, 2 };
        System.out.println("Sorting the array :");

        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order:");

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}