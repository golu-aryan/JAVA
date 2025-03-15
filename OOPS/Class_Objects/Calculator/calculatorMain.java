package JAVA.OOPS.Class_Objects.Calculator;

import java.util.Scanner;
public class calculatorMain {

        private Scanner scanner;
        private Calculator calculator;

        public calculatorMain() {
            scanner = new Scanner(System.in);
            calculator = new Calculator();
        }
        public void displayMenu () {
            int n1, n2;
            int userChoice;


            while (true) {
                System.out.println("------   Aryan's Calculator[Menu]  ------");
                System.out.println("1>  Add");
                System.out.println("2>  Subtract");
                System.out.println("3>  Multiply");
                System.out.println("4>  Divide");
                System.out.println("5>  Exit");
                System.out.println("Please enter the operation [1-5] :-> ");
                userChoice = scanner.nextInt();
                if (userChoice == 0) {
                    System.out.println("Invalid choice");
                }

                if (userChoice >= 1 && userChoice <= 4) {
                    System.out.println("Enter 1 Number :-> ");
                    n1 = scanner.nextInt();
                    System.out.println("Enter 2 Number :-> ");
                    n2 = scanner.nextInt();

                    int result = 0;
                    switch (userChoice) {
                        case 1:
                            result = calculator.add(n1, n2);
                            break;
                        case 2:
                            result = calculator.subtract(n1, n2);
                            break;
                        case 3:
                            result = calculator.multiply(n1, n2);
                            break;
                        case 4:
                            result = calculator.divide(n1, n2);
                            break;
                    }
                    System.out.println("Result :-> " + result);
                } else if (userChoice == 5) {
                    System.out.println("Exit...");
                } else {
                    System.out.println("Invalid choice! Please try Again");
                }
            }
        }
    }

