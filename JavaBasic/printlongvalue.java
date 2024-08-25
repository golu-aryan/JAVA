import java.util.Scanner;

public class printlongvalue {
    public static void main(String[] args){
        long n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the long value:");
        n = sc.nextLong();

        System.out.println("The number is : " + n);

        sc.close();
    }
}
