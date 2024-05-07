import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Enter the size for array elements:");
        int size = q.nextInt();
        int arr[] = new int[size];
        System.out.println("Please Provide number:");
        for(int i = 0; i<size; i++){
            arr[i] = q.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i =0 ; i< size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimun array element is"+ min);
        System.out.println("Maximun array element is"+ max);
    }
}
