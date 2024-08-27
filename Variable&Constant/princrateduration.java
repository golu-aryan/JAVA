import java.util.Scanner;

public class princrateduration {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter principal : ");
        double principal = t.nextDouble();

        System.out.print("Enter rate : ");
        float rate = t.nextFloat();

        System.out.print("Enter duration :");
        int time = t.nextInt();

        double interest = (principal * rate * time) / 100;

        System.out.println("your interest is : " + interest);
        t.close();
    }
}
