import java.util.Scanner;

//Check if a Passenger is Eligible for Ladies Quota
//Write a Java program that takes the gender and age of the passenger as input. If the gender is 
//female and the age is above 12, print that the passenger is eligible for booking under the Ladies 
//Quota. Otherwise, print that the passenger is not eligible
public class passenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Gender [ Male/Female ]: ");
        String gender = scanner.next().toUpperCase();

        System.out.print("Enter your Age : ");
        int age = scanner.nextInt();

        if (gender.equalsIgnoreCase("Female") && age > 12) {
            System.out.println("Passenger is eligible for booking under the Ladies Quota");
        } else {
            System.out.println("The Passenger is not eligible");
        }
        scanner.close();
    }
}
