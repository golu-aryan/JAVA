import java.util.Scanner;
//Calculate the sum of all the elements in the given array
public class sum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter size of array elements:");
        int s = n.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter "+s+"Elements:");
        for(int i = 0; i< s; i++){
            arr[i] = n.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array elements:"+sum);
    }
}
