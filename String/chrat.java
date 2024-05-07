import java.util.Scanner;

public class chrat {
    public static void main(String[] args) {
        String s = new String();
        int len;
        Scanner q = new Scanner(System.in);
        System.out.println("Enter String:");
        s = q.nextLine();
        len = s.length();

        // System.out.println("The string is:"+s);
        // System.out.println("The length of string is:"+len);
        for(int i = 0; i<len; i++){
            System.out.println(s.charAt(i));
        }
    }
}
