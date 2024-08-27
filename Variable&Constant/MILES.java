import java.util.Scanner;
//write a program to accept the distance in miles and print distance in kilometer
public class MILES {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter distance in miles : ");
        double miles = n.nextDouble();

        double kilometer = miles*1.60934;
        System.out.println("Distance in kilometer is : "+ kilometer);
        n.close();
    }
}
