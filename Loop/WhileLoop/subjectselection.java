import java.util.Scanner;

public class subjectselection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int departments, subject;

        System.out.print("Do you want to select a subject [y/n] :-> ");
        String userChoice = scanner.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {
            System.out.println("---Departments---");
            System.out.println("1>  Science");
            System.out.println("2>  Commerce");
            System.out.println("3>  Arts");
            System.out.print("Enter Departments :-> ");
            departments = scanner.nextInt();

            if (departments == 0) {
                System.out.println("Exit...");
                break;
            }

            if (departments == 1) {
                while (true) {
                    System.out.println("---Science Departments---");
                    System.out.println("1> Physics");
                    System.out.println("2> Chemistry");
                    System.out.println("3> Biology");
                    System.out.println("4> Mathematics");
                    System.out.print("Enter Subject :-> ");
                    subject = scanner.nextInt();

                    if (subject == 0) {
                        System.out.println("Exit...");
                        break;
                    } else if (subject == 1) {
                        System.out.println("You select : Physics");
                        break;
                    } else if (subject == 2) {
                        System.out.println("You select : Chemistry");
                        break;
                    } else if (subject == 3) {
                        System.out.println("You select : Biology");
                        break;
                    } else if (subject == 4) {
                        System.out.println("You select : Mathematics");
                        break;
                    } else {
                        System.out.println("Invalid subject select, Please Try Again");
                        continue;
                    }
                }
            } else if (departments == 2) {
                while (true) {
                    System.out.println("---Commerce Departments---");
                    System.out.println("1> Accountancy");
                    System.out.println("2> Business Studies");
                    System.out.println("3> Economics");
                    System.out.print("Enter Subject :-> ");
                    subject = scanner.nextInt();

                    if (subject == 0) {
                        System.out.println("Exit...");
                        break;
                    } else if (subject == 1) {
                        System.out.println("You select : Accountancy");
                        break;
                    } else if (subject == 2) {
                        System.out.println("You select : Business Studies");
                        break;
                    } else if (subject == 3) {
                        System.out.println("You select : Economics");
                        break;
                    } else {
                        System.out.println("Invalid subject select, Please Try Again");
                        continue;
                    }
                }
            } else if (departments == 3) {
                while (true) {
                    System.out.println("---Arts Departments---");
                    System.out.println("1> History");
                    System.out.println("2> Political Science");
                    System.out.println("3> Sociology");
                    System.out.println("4> Geography");
                    System.out.print("Enter subject :-> ");
                    subject = scanner.nextInt();

                    if (subject == 0) {
                        System.out.println("Exit...");
                        break;
                    } else if (subject == 1) {
                        System.out.println("You select : History");
                        break;
                    } else if (subject == 2) {
                        System.out.println("You select : Political Science");
                        break;
                    } else if (subject == 3) {
                        System.out.println("You select : Sociology");
                        break;
                    } else if (subject == 4) {
                        System.out.println("You select : Geography");
                        break;
                    } else {
                        System.out.println("Invalid subject select, Please Try Again");
                        continue;
                    }
                }
            } else {
                System.out.println("Invalid Department selected, Please Try Again");
                continue;
            }

            scanner.nextLine();

            System.out.print("If you want to select Again [y/n] :-> ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("n")) {
                break;
            }
        }
        scanner.close();
    }
}
