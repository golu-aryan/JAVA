import java.util.Scanner;
public class table {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = n.nextInt();
        int t;
        for(int i = 1; i<=10; i++){
            t = i*num;
            System.out.println(t);
        }
    }
}
