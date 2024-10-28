import java.util.Scanner;

public class squareofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, number;

        System.out.print("Enter number :-> ");
        number = scanner.nextInt();

        for (; number != 0; number /= 10){
             sum += Math.pow(number%10,2);
        }
        System.out.println(sum);

        scanner.close();
    }
}