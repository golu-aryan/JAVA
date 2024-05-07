import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter "+n+" array elements :");
        for(int i = 0; i<n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Array After Reversal:");
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
}