import java.util.Scanner;

public class decimaltobinary {
    public static int getvalueInBase(int n, int b){
        int rv = 0;

        int p = 1;
        while(n>0){
            int d = n%b;
            n /= b;

            rv += d * p;
            p = p * 10;
        }
        return rv;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int b = s.nextInt();

        int dn = getvalueInBase(n, b);

        System.out.println(dn);
    }
}
