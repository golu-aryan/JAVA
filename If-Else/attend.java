import java.util.Scanner;

public class attend {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        char Attendance;

        System.out.print("Enter the Name : ");
        String name = n.nextLine();

        System.out.print("Is " + name + " Present or Absent? Enter value in [P/A] :-");
        Attendance = n.nextLine().charAt(0);
        // == - We can use this operator to compare the values of primitive data type
        // like int, float, char etc
        // In the case of String == will not compare value of the two String variables.
        // To compare the values of String we can use String.equals(String) method.
        if (Attendance == 'P' || Attendance == 'p') {
            System.out.print("Talk to " + name);
        } else if (Attendance == 'A' || Attendance == 'a') {
            System.out.print("No Need to talk to " + name);
        } else {
            System.out.println("Invalid choice!");
        }
        n.close();
    }
}
