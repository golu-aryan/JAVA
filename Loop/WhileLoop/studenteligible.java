import java.util.Scanner;

public class studenteligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mathMarks, physicsMarks, chemistryMarks;

        int passingMarks = 40;

        while (true) {
            System.out.print("Enter Mathematics Marks [0 - 100]:-> ");
            mathMarks = scanner.nextInt();

            if (mathMarks >= 0 && mathMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input. Please Enter marks between 0 and 100");
                continue;
            }
        }

        while (true) {
            System.out.print("Enter Physics Marks [0 - 100] :-> ");
            physicsMarks = scanner.nextInt();

            if (physicsMarks >= 0 && physicsMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input. Please Enter Marks between 0 and 100");
                continue;
            }
        }

        while (true) {
            System.out.print("Enter Chemistry Marks [0 - 100] :-> ");
            chemistryMarks = scanner.nextInt();

            if (chemistryMarks >= 0 && chemistryMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input. Please Enter Marks between 0 and 100");
                continue;
            }
        }

        int totalMarks = mathMarks+physicsMarks+chemistryMarks;
        double percentage = (totalMarks/300.0) * 100;

        System.out.println("Your Total Marks is : " + totalMarks);

        if (mathMarks >= passingMarks && physicsMarks >= passingMarks && chemistryMarks >= passingMarks) {
            if (percentage >= 50) {
                System.out.println("You are eligible for admission");
            } else {
                System.out.println("Your are not eligible for admission due to lowest percentage");
            }
        } else {
            System.out.println("You're not eligible for admission due to failing in one or more subjects");
        }

        System.out.print("Your aggregate percentage : " + percentage);

        scanner.close();
    }
}