import java.util.Scanner;

public class giftwrapping {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Do you want gift wrapping for you purchase? Enter [yes/no] :-> ");
    String giftWrapping = scanner.nextLine();

    if (giftWrapping.equalsIgnoreCase("Yes")) {
        System.out.println("Gift wrapping is selected. The charge for gift wrapping is 5");
    } else if (giftWrapping.equalsIgnoreCase("No")) {
        System.out.println("No Gift wrapping selected. No additional charges will be applied");
    } else {
        System.out.println("Error: Please enter 'Yes' or 'No' only");
    }
    
    scanner.close();
    }
}
