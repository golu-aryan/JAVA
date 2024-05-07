import java.util.Scanner;

public class Pe {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check:");
        s = sc.nextLine();
        int i, j, flag;
        i = 0;
        j = s.length() - 1;
        flag = 0;

        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;
            }
            i++;
            j--;
        }
        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}