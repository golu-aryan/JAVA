public class breaking {
    public static void main(String[] args) {
    int num = 1;

    while (num <= 1000) {
        System.out.println(num);
        num++;
        if (num >= 10) {
            break;
        }
    }
    
    }
}
