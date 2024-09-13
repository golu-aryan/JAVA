import java.util.Scanner;

class Add {
    int a, b, c;

    Scanner q = new Scanner(System.in);

    void getdata(int x, int y) {
        a = x;
        b = y;

        c = a + b;
    }

    void print() {
        System.out.println("Here is your number : " + c);
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.getdata(2, 3);
        obj.print();
    }
}