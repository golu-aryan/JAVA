import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number [1-12] :->");
        System.out.println("11, 12, 1, 2 - for Winter");
        System.out.println("3,4,5,6 - for Summer");
        System.out.println("7,8,9,10 - for Rainy");

        int month = scanner.nextInt();

        switch(month){
            case 11:
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Rainy");
                break;
            default:
                System.out.println("Invalid month Number");
                break;
        }
        scanner.close();
    }
}
