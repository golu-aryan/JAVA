import java.util.Scanner;
public class another {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int  monthNumber;
        System.out.print("Enter the Month number : ");
        monthNumber = sc.nextInt();

        switch (monthNumber)
        {
            case 11, 12, 1, 2:
                            System.out.print("Winter Season");
                            break;
            case 3, 4, 5, 6:
                            System.out.print("Summer Season");
                            break;
            case 7, 8, 9, 10:
                            System.out.print("Rainy Season");
                            break;
            default:
                System.out.print("Invalid");
        }
        sc.close();
    }
}
