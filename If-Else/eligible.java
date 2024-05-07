import java.util.Scanner;


public class eligible {
    public static void main(String args[]){
        int age ;
        System.out.println("Enter the age of a person:-");
        Scanner t = new Scanner(System.in);
        age = t.nextInt();
        if(age >= 18 && age < 40){
            System.out.println("You're eligible for voting");
        }else if (age<=50 && age>=40) {
            System.out.println("You're also eligible for voting and you're special person for this. Thank you");
        }
        else{
            System.out.println("Sry! You're not eligible");
        }
    }
}
