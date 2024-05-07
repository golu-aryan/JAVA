import java.util.Scanner;

//A program for checking two String in case Sensitive and non case sensitive manner
public class Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        
        System.out.println("Enter the Frist String:");
        s1 = sc.nextLine();
        System.out.println("Enter the second String:");
        s2 = sc.nextLine();
        sc.close();

        if (s1.equals(s2)) {
            System.out.println("Equal String");
        } else {
            System.out.println("Not Equal String");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
