import java.util.Scanner;
//Write a program count the digit which is input by the user.
public class count{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int n = s.nextInt();
        int count = 0;
        while(n!=0){
            n /= 10;
            count++;
        }
        System.out.println("The number of digit is :" + count);
        s.close();
    }
}