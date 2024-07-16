import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter digit:");
            int n = sc.nextInt();
            int cnt = 0;
            for(int i = 0; i<n; i++){
                n = n/10;
                cnt++;
            }
            System.out.println("The number of digits are :" + cnt);
    }
}
