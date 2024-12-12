import java.util.Scanner;

public class StudentResult {
    public static boolean isValid(float marksObtained, float minmarks, float maxmarks) {
        if (marksObtained >= minmarks && marksObtained <= maxmarks) {
            return true;
        }
        return false;
    }

    public static float getTotal(float sub1, float sub2, float sub3) {
        float totalMarks;
        totalMarks = sub1 + sub2 + sub3;
        return totalMarks;
    }

    public static float getPercentage(float marksObtained, float maxmarks) {
        float getPercentage;
        getPercentage = (marksObtained / maxmarks) * 100;
        return getPercentage;
    }

    public static boolean isPass(float marksObtained, float maxmarks) {
        float percentage;
        percentage = getPercentage(marksObtained, maxmarks);

        if (percentage < 30) {
            return false;
        }
        return true;
    }

    public static String calculateGrade(float sub1Marks, float sub1MaxMarks, float sub2Marks, float sub2MaxMarks,
            float sub3Marks, float sub3MaxMarks) {
        float totalMarksObtained;
        float maxmarks;
        float percentage;

        if (isPass(sub1Marks, sub1MaxMarks) && isPass(sub2Marks, sub2MaxMarks) && isPass(sub3Marks, sub3MaxMarks)) {
            totalMarksObtained = getTotal(sub1MaxMarks, sub2MaxMarks, sub3MaxMarks);
            maxmarks = getTotal(sub1MaxMarks, sub2MaxMarks, sub3MaxMarks);
            percentage = getPercentage(totalMarksObtained, maxmarks);
        } else {
            return "fail";
        }

        if (percentage >= 60) {
            return "First Division";
        } else if (percentage >= 45) {
            return "Second Division";
        } else if (percentage >= 30) {
            return "Third Division";
        } else {
            return "fail";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float sub1, sub2, sub3, sub1MaxMarks, sub2MaxMarks, sub3MaxMarks;
        int minmarks = 0;
        String result;

        System.out.print("Enter the maximum marks of C programming :-> ");
        sub1MaxMarks = scanner.nextFloat();

        System.out.print("Enter Obtained marks of C programming [0 - " + sub1MaxMarks + " ] :-> ");
        sub1 = scanner.nextFloat();

        if (!isValid(sub1, minmarks, sub1MaxMarks)) {
            System.out.println(
                    "The value you entered for C programming is not within the permissible range. The permissible range is "
                            + minmarks + " - " + sub1MaxMarks);
            return;
        }

        System.out.print("Enter the Maximum marks of Java Programming :-> ");
        sub2MaxMarks = scanner.nextFloat();

        System.out.print("Enter Obtained marks of Java Programming [0 - " + sub2MaxMarks + " ] :->  ");
        sub2 = scanner.nextFloat();

        if (!isValid(sub2, minmarks, sub2MaxMarks)) {
            System.out.println(
                    "The value you entered for Java programming is not within the permissible range. The permissible range is "
                            + minmarks + " - " + sub2MaxMarks);
            return;
        }

        System.out.print("Enter the Maximum marks of Python Programming :-> ");
        sub3MaxMarks = scanner.nextFloat();

        System.out.print("Enter Obtained marks of Python Programming [0 - " + sub3MaxMarks + " ] :-> ");
        sub3 = scanner.nextFloat();

        if (!isValid(sub3, minmarks, sub3MaxMarks)) {
            System.out.println(
                    "The value you entered for Python programming is not within the permissible range. The permissible range is "
                            + minmarks + " - " + sub3MaxMarks);
            return;
        }

        result = calculateGrade(sub1, sub1MaxMarks, sub2, sub2MaxMarks, sub3, sub3MaxMarks);
        System.out.println("your Grade is :-> " + result);
        scanner.close();
    }
}