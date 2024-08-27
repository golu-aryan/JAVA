import java.util.Scanner;

public class ownscar {
    public static void main(String[] args){
        String name;
        int age;
        float monthlysalary;
        boolean cars;
        Scanner n = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = n.nextLine();

        System.out.print("Enter your age :");
        age = n.nextInt();

        System.out.print("Enter your Monthly salary:");
        monthlysalary = n.nextFloat();

        System.out.print("If you owns a car? Type:[True/False] - ");
        cars = n.nextBoolean();

        System.out.println("Employee's Name : " + name);
        System.out.println("Employee's Age : " + age);
        System.out.println("Employee's MonthlySalary : " + monthlysalary);
        System.out.println("Owns a car :" + cars);
        n.close();
    }
}
