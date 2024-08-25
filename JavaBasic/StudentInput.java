import java.util.Scanner;
public class StudentInput {
    public static void main(String[] args){
        String name;
        int rollNumber;
        float c, java, ttl_marks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        name = sc.nextLine();

        System.out.print("Enter your roll number : ");
        rollNumber = sc.nextInt();

        System.out.println("Enter your c and java marks : ");
        c = sc.nextFloat();
        java = sc.nextFloat();

        ttl_marks = c+java;
        System.out.println("your name is :" + name + "\nyour roll number is : "+ rollNumber+
                "\nyour marks of c and java is :" +c + "," +java + "\nyour total marks is:"+ttl_marks );

        sc.close();
    }
}
