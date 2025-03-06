package JAVA.OOPS.Class_Objects;

import java.util.Scanner;

public class studentMain {
    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int id, age;
        String name, course;

        System.out.print("Enter student ID :-> ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student Name :-> ");
        name = scanner.nextLine();

        System.out.print("Enter student Age :-> ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student Course :-> ");
        course = scanner.nextLine();

        student student1 = new student();

        //Assigning student id, name, age, course
        student1.acceptInfo(id, name, age, course);

        //Display Information about Student
        student1.displayInfo();

        //Greeting Student
        student1.greet();

        //Update New Course
        student1.updateCourse("Software Engineering");

        //Checking student is Eligible or not
        if (student1.isEligible()) {
            System.out.println(student1.name + " is Eligible for Placement");
        } else {
            System.out.println(student1.name + " is not Eligible for Placement");
        }

        System.out.println("------ Modified Details ------");
        //Modifying Details of Student and Displaying Updated Info
        System.out.print("Enter Student Name :-> ");
        name = scanner.nextLine();

        System.out.print("Enter Student Age :-> ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Course :-> ");
        course = scanner.nextLine();

        student1.update(name, age, course);

        System.out.println("After updating Student Info :-> ");
        student1.displayInfo();

        //Checking student is Eligible or not
        if (student1.isEligible()) {
            System.out.println(student1.name + " is Eligible for Placement");
        } else {
            System.out.println(student1.name + " is not Eligible for Placement");
        }

        student student2 = new student();
        student2.acceptInfo(2, "Aryan Kumar", 22, "MCA");
        student2.displayInfo();

        student student3 = new student();
        student3.acceptInfo(3, "Aprajita Thakur", 21, "MBA");
        student3.displayInfo();

        scanner.close();
    }
}