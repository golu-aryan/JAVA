package JAVA.OOPS.NestedClass.Static.s_VariableandMethod;

public class Student {
    //Instance variables - unique to each student
    String studentName;
    int rollNumber;

    //Static Variable - Shared by all Student Objects
    static int studentCount = 0;

    //Constructor
    public Student (String Name, int roll) {
        this.studentName = Name;
        this.rollNumber = roll;

        //Increment the shared count whenever a new student is created
        studentCount++;
    }

    //Instance method to display student info
    public void displayInfo() {
        System.out.println("Roll No :-> " + rollNumber);
        System.out.println("Name :-> " + studentName);
    }
    //Static method to display total number of Students
    public static void showTotalAdmissions () {
        System.out.println("Total Students Admitted :-> " + studentCount);
    }
    //Main Method for Testing
    public static void main(String[] args) {
        Student s1 = new Student("Aryan", 1);
        Student s2 = new Student("Anand", 2);
        Student s3 = new Student("Shrivastava", 3);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        //Call Static Method using Class Name
        Student.showTotalAdmissions();
    }
}
