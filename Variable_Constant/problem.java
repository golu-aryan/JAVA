public class problem{
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int result = x++ + ++y -(y-- * 2);
        System.out.println(result);
    }
}