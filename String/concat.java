import java.util.Scanner;
public class concat {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String s1 = n.next();
        System.out.println("Enter the second String:");
        String s2 = n.next();


        String s3 = s1.concat(s2);

        System.out.println("The concated String is :--"+ s3);
    }
}