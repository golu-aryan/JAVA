package JAVA.OOPS.Class_Objects;
import javax.naming.Name;
import java.util.Scanner;

public class teacherMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, subject;
        int id, salary;
        teacher teacher = new teacher();

        System.out.print("Enter Teacher Name :> ");
        name = scanner.nextLine();

        System.out.print("Enter Teacher id :-> ");
        id = scanner.nextInt();

        System.out.print("Enter Teacher Salary :> ");
        salary = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Teacher Subject :-> ");
        subject = scanner.nextLine();

        teacher.setDetails(name, id, salary, subject);

        teacher.displayData();

        teacher.annualSalary(salary);
        System.out.println(name + " Annual Salary is :> " + salary);

        System.out.println("After Give Raise for " + name);
        teacher.GiveRaise(10);


        System.out.println("------ Updating Teacher Details ------");
        System.out.print("Enter New Teacher Name :-> ");
        name = scanner.nextLine();

        System.out.println("Enter New ID :-> ");
        id = scanner.nextInt();

        System.out.println("Enter New Salary :-> ");
        salary = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter New Subject :-> ");
        subject = scanner.nextLine();

        teacher.updateTeacher(name, id, salary, subject);
        teacher.displayData();

        scanner.close();
    }
}
