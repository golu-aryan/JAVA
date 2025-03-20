import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class reading {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
            System.out.println("The Content of the File is given above.");
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
