import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Sentence:");

        String line = in.nextLine();
        //Initialize an empty string to store the result in uppercase
        String upper_case_line = " ";
        //Create a Scanner to process individual words in the sentence
        Scanner lineScan = new Scanner(line);

        //Iterate thorugh the words in the sentence
        while(lineScan.hasNext()){
            String word = lineScan.next();

            upper_case_line += Character.toUpperCase(word.charAt(0))+word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
        in.close();
    }
}
