import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class simpleFileHandling {
    public static void createFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is the first line of the file");
            System.out.println("File Created (or overwritten) at : " + filePath);
        } catch (IOException io) {
            System.out.print(io.getMessage());
        }
    }

    public static void addDataToFile(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            System.out.println("Data added to the file : " + filePath);
            System.out.println("Added Data :-> " + data);
        } catch (IOException io) {
            System.out.print("An error occured while adding data to the file : " + io.getMessage());
        }
    }

    public static void copyFile(String sourcePath, String destinationPath) {
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Copied from " + sourcePath + " to " + destinationPath);
        } catch (IOException io) {
            System.out.println("An error occured while copying file : " + io.getMessage());
        }
    }

    public static void moveFile(String sourcePath, String destinationPath) {
        try {
            Files.move(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Moved from " + sourcePath + " to " + destinationPath);
        } catch (IOException io) {
            System.out.println("An error occured while moving the fle : " + io.getMessage());
        }
    }

    public static void deleteFile(String filePath) {
        try {
            Files.delete(Paths.get(filePath));
            System.out.println("File Deleted : " + filePath);
        } catch (IOException io) {
            System.out.println("An error occured while deleting the file : " + io.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "test.txt";
        String copyPath = "test_copy.txt";
        String movePath = "test_move.txt";

        createFile(filePath);
        addDataToFile(filePath, "\nThis is the new Line of test");
        copyFile(filePath, copyPath);
        moveFile(filePath, movePath);
        deleteFile(movePath);
    }
}
