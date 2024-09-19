import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year:--");
        int year = scanner.nextInt();
        

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.err.println(year + " is leap year");
        } else {
            System.out.println("Sry!" + year + " This is not leap year");
        }
        scanner.close();
    }
}
