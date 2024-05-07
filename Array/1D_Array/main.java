import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+(n)+"array elements:");
        for(int i =0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int evencount = 0, oddcount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Total Even number:"+evencount+"\nTotal odd number:"+oddcount);
    }
}