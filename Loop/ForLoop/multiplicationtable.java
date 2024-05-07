/*write a program that takes a number as input and prints its multiplicaton table upto 10 */
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number for the multiplication table:--");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i <10; i++){
            System.out.println(n + "x" + (i+1)+ "=" + (n*(i+1)));
        }
        s.close();
    }
}
