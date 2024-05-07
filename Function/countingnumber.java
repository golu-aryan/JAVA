import java.util.Scanner;

public class countingnumber{
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int n;
        System.out.println("Enter the number = ");
        n = t.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println("The counting number is :--" + i);
        }
        t.close();
    }
}
