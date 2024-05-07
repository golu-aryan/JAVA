import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,arm,sum = 0;
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        arm = n;
        for (int i = 1; i < n; i++) {
            while(n>0){
                r = n%10;
                sum = sum+(r*r*r);
                n = n/10;
            }
        }
        if(arm == sum){
            System.out.println("This is Armstrong:"+arm);
        } else{
            System.out.println("This is not Armstrong"+arm);
        }
        sc.close();
    }
}
