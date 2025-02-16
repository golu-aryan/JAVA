import java.util.Scanner;

public class greaterno {
    public static void main(String [] args){
        int a,b,c;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the three number :--");
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("A is greater number");
            } else {
                System.out.println("C is greater number");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("B is greater numbre");
            }
            else{
                System.out.println("C is greater number");
            }
        }
    }
}