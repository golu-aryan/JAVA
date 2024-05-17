import java.util.Scanner;

public class findelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements for array : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are :" + " ");

        for(int i = 0; i< n; i++){
            System.out.println(arr[i]); 
        }
        int key;
        System.out.println("Enter the key to search : ");
        key = sc.nextInt();
        int indx = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                indx = i;
                break;
            } 
        }
        System.out.println(indx);
    }
}
