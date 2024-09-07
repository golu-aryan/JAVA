import java.util.Scanner;

//Write a program to accept the float value and convert that value to integer.
//Print the float and integer values
public class float_int {
    public static void main(String[] args){
        Scanner q = new Scanner(System.in);
        float val;

        System.out.print("Enter your number : ");
        val = q.nextFloat();
        
        //Convert the float value to an integer.
        int res = (int) val;

        System.out.println("Your float value is : " + val);
        
        System.out.println("Your integer value is : " + res);

        q.close();
    }
}
