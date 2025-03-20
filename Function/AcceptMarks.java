import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AcceptMarks {
    public static void getMarks(int[] number, Scanner scanner) {
        for (int i = 0; i < number.length; i++) {
            System.out.print("Please Enter " + i + " Number :-> ");
            number[i] = scanner.nextInt();
        }
    }

    public static void accessMarks(int[] number) {
        System.out.println("The Marks are :->>>>>>>>>>>>");
        for (int marks : number) {
            System.out.println(marks);
        }
    }

    public static void sorted(int[] number) {
        System.out.println("After Sorting Marks are :->>>>>>>");
        Arrays.sort(number);
        for (int marks : number) {
            System.out.println(marks);
        }
    }

    public static void descending(int[] num) {
        // Integer[] numbers = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Integer[] numbers = new Integer[5];
        int i = 0;
        for (int marks : num) {
            numbers[i] = marks;
            i++;
        }
        i = 0;

        Arrays.sort(numbers, Collections.reverseOrder());
        for (int marks : numbers) {
            num[i] = marks;
            i++;
        }
        System.out.println("Descending Order Marks are :->>>>>>>>");
        for (int marks : num) {
            System.out.println(marks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        getMarks(marks, scanner);
        accessMarks(marks);
        sorted(marks);
        descending(marks);
        scanner.close();
    }
}