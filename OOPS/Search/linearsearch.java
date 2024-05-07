
import java.util.Scanner;

class linear {
    int key;
    int a[] = new int[10];

    void getdata() {
        Scanner n = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Enter number:");
            a[i] = n.nextInt();
        }
        System.out.println("Enter number for searching:");
        key = n.nextInt();
        n.close();
    }

    void search() {
        for (int i = 0; i < 10; i++) {
            if (a[i] == key) {
                System.out.println("Number found at position:" + (i + 1));
            }
        }
    }
}

public class linearsearch {
    public static void main(String[] args) {
        linear l = new linear();
        l.getdata();
        l.search();
    }
}
