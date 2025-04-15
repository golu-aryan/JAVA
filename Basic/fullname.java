package JAVA.Basic;
import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String firstname, secondname;
        System.out.print("Enter your first name : ");
        firstname = n.nextLine();

        System.out.print("Enter your middle name : ");
        String middlename = n.nextLine();

        System.out.print("Enter your last name : ");
        secondname = n.nextLine();

        System.out.println("Your name is : " + firstname + " " + middlename + " " + secondname);
        n.close();
    }
}
