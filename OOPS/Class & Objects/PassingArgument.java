import java.util.Scanner;

public class PassingArgument {
    int n;

    void getdata(int i) {   
        n = i;
    }

    void putdata() {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {
        PassingArgument q = new PassingArgument();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int m = sc.nextInt();
        q.getdata(m);
        q.putdata();

        sc.close();
    }
}
