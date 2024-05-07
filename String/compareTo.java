import java.util.Scanner;
public class compareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        
        System.out.println("Enter the Frist String:");
        s1 = sc.nextLine();
        System.out.println("Enter the second String:");
        s2 = sc.nextLine();
        sc.close();

        if(s1.compareTo(s2)==0){
            System.out.println("Equal String");
        } else if(s1.compareTo(s2)>0){
            System.out.println("s1 is greater than s2");
        } else {
            System.out.println("s2 is greater than s1");
        }
    }
}
