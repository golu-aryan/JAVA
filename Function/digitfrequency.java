import java.util.Scanner;
//Write a program to input the digit by the user also the number which is checked in digit that how many times the number repeated and it is the output.
public class digitfrequency {

    public static int getdigitfrequency(int n, int d){
        int rv = 0;
        while(n > 0){
            int dig = n%10;

            n /= 10;

            if(dig == d){
                rv++;
            }
        }
        return rv;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Digit : ");
        int n = sc.nextInt();

        System.out.println("Enter the number for frequency check:");
        int d = sc.nextInt();

        int f = getdigitfrequency(n,d);
        System.out.println("Frequency of "+d+" in "+n+" is "+f);
    }
}
