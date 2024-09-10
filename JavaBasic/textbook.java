import java.util.Scanner;
//Write a program to calculate cost of Textbooks for a semester.
//Compute total cost for all textbooks required for a semester.
public class textbook {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter your Cost of TextBooks for 1 Semester :");
        double sem1 = n.nextDouble();

        System.out.print("Enter your Cost of TextBooks for 2 Semester :");
        double sem2 = n.nextDouble();
        System.out.print("Enter your Cost of TextBooks for 3 Semester :");
        double sem3 = n.nextDouble();
        System.out.print("Enter your Cost of TextBooks for 4 Semester :");
        double sem4 = n.nextDouble();
        System.out.print("Enter your Cost of TextBooks for 5 Semester :");
        double sem5 = n.nextDouble();
        System.out.print("Enter your Cost of TextBooks for 6 Semester :");
        double sem6 = n.nextDouble();

        double totalCost = sem1+sem2+sem3+sem4+sem5+sem6;

        System.out.println("Your Total cost of all TextBooks is :" + totalCost);

        n.close();
    }
}
