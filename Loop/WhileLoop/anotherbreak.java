import java.util.Scanner;
public class anotherbreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        char answer;

        while (num <= 1000) {
            System.out.println(num);
            num++;
            System.out.print("Do you want to continure [y/n] :->");
            answer = scanner.nextLine().charAt(0);

            if (answer != 'y') {
                break;
            }

        }

        scanner.close();
    }
}
