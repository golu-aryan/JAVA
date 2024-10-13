
public class ASCIIvalue {
    public static void main(String[] args) {

        char ch;
        int asciicode = 0;

        while (asciicode <= 255) {
            ch = (char) asciicode;
            System.out.println("The character value of ASCII code " + asciicode + " is " + ch);
            asciicode++;
        }

    }
}
