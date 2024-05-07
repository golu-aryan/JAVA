/*write a program to print odd numbers from 1 to 99. Prints one number per line */
public class odd1to100 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
