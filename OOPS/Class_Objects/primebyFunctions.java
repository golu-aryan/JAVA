package JAVA.OOPS.Class_Objects;

import java.util.Scanner;

public class primebyFunctions {
    int n;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
    }
    void putdata(){
        int i,count = 0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count = count+1;
            }
        }
        if(count==2){
            System.out.println("prime");
        } else{
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        primebyFunctions aa = new primebyFunctions();
        aa.getdata();
        aa.putdata();
    }
}
