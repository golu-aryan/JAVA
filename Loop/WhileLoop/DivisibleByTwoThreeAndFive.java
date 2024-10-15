public class DivisibleByTwoThreeAndFive {
    public static void main(String[] args) {
        // Initialize the starting number
        int num1 = 252;
        int num2 = 300;
        int num3 = 400;

        while (num1 <= 270 || num2 <= 350 || num3 <= 500) {
            if (num1 <= 270 && num1%3 == 0) {
                System.out.print(num1 + " ");
            }
            if (num2 <= 350 && num2%5 == 0) {
                System.out.print(num2 + " ");
            }
            if (num3 <= 500 && num3%2 == 0) {
                System.out.print(num3 + " ");
            }
            num1+=3;
            num2+=5;
            num3+=2;
        }
    }
}