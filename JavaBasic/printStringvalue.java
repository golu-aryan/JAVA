import java.util.Scanner;

public class printStringvalue {
    public static void main(String[] args) {
        String Str,str;

        Scanner v = new Scanner(System.in);
        System.out.print("Enter string value : ");
        Str = v.next();

        System.out.print("Enter string value : ");
        str = v.next();

        System.out.print("The string is : " + Str + " " + str);
    }
}
