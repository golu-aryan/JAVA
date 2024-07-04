import java.util.Scanner;
//Nested Loop = a loop inside of a loop 
public class next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        String Symbol = "";

        System.out.println("Enter rows: ");
        rows = sc.nextInt();
        System.out.println("Enter columns: ");
        columns = sc.nextInt();
        System.out.println("Enter Symbol to use : ");
        Symbol = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(Symbol);
            }
        }
    }
}
