public class greater {
    public static void main(String[] args) {
        int a = 10, b = 12, c =11;
        int r = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
    }
}
