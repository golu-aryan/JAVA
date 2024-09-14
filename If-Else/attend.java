import java.util.Scanner;

public class attend {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        char Attendance;

        System.out.print("Name : ");
        String name = n.nextLine().toUpperCase();

        System.out.printf("Is %s Present or Absent? Enter value in [P/A] :-", name);
        Attendance = n.nextLine().charAt(0);

        if (Attendance == 'P' || Attendance == 'p') {
            System.out.printf("Talk to %s \n", name);
        } else {
            System.out.printf("No Need to talk to %s", name);
        }
        n.close();
    }
}
