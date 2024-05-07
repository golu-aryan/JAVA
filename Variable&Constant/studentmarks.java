/* write a program to calculate percentage of a given student in CBSE board exzm. His marks from 5 subjects must be taken as input from the keyword.(Mark are out of 100)*/

import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the five subjects marks:--");

        float math = in.nextFloat();
        float physics = in.nextFloat();
        float hindi = in.nextFloat(); 
        float chemistry = in.nextFloat();
        float english = in.nextFloat();

        float total = (math + physics + chemistry + hindi + english);
        float average = total / 5;
        float percentage = (total / 500) * 100;

        System.out.println("The total marks is - " + total);
        System.out.println("The average is - " + average);
        System.out.println("The percentage is - " + percentage);

        char grade = 'x';
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'B';
        } else if (average >= 70 && average < 80) {
            grade = 'C';
        } else if (average >= 60 && average < 70) {
            grade = 'D';
        } else {
            System.out.println("Sry! You're Fail in Exam.");
        }
        System.out.println("Your grade is = " + grade);
    }
}
