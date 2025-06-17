import java.util.Scanner;

public class WaveMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaveForms wf = new WaveForms();

        System.out.print("Enter the size of the Array :-> ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Size! Must be > 0");
            return;
        }

        int[] original = new int[size];
        int[] unique = new int[size];

        System.out.print("Enter " + size + " elements :-> ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i+1) + ":-> ");
            original[i] = scanner.nextInt();
        }  

        System.out.println("Original Array :-> ");
        wf.display(original, size);

        int newSize = wf.removeDuplicate(original, size, unique);
        System.out.println("After Removing Duplicates :-> ");
        wf.display(unique, newSize);

        wf.sortArray(unique, newSize);
        System.out.println("After Sorting :-> ");
        wf.display(unique, newSize);

        wf.waveSort(unique, newSize);   
        System.out.println("Wave Form Array :-> ");
        wf.display(unique, newSize);
        scanner.close();
    }
}