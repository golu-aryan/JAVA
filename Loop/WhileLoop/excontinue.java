
public class excontinue {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            num++;
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }

    }
}
