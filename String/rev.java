public class rev {
    public static void main(String[] args) {
        int l;
        String r1 = "Batman";
        String r2 = " ";
        l = r1.length();

        for(int i = l-1; i>=0; i--){
            r2 = r2+r1.charAt(i);
        }
        System.out.println(r2);
    }
}
