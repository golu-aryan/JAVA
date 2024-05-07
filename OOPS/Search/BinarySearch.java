import java.util.Scanner;

class Searching {
    int[] ar = new int[10];
    int key;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number" + (i + 1)+" : ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter number to search:");
        key = sc.nextInt();
    }

    void search(){
        int i, j, mid, flag,pos;
        i = 0;
        j = 9;
        flag = 0;
        pos = 0;
        while(i<=j && flag == 0){
            mid = (i+j)/2;
            if(ar[mid]==key){
                flag = 1;
                pos = mid+1;
            }
            if(ar[mid]>key){
                j = mid-1;
            }
            if(ar[mid]<key){
                i = mid+1;
            }
        } 
        if(flag==0){
            System.out.println("Element not found");
            }
        else{
            System.out.println("Element found at position:"+pos);
        }
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Searching s = new Searching();
        s.getdata();
        s.search();
    }
}
