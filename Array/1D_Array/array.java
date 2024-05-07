import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i = 0; i<5; i++){
            a[i] = s.nextInt();
        }
        System.out.println("array elements:");
        for (int v : a) {
            System.out.print(v+ " ");
        }
        s.close();
    }
}
 