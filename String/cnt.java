import java.util.Scanner;

public class cnt {
    public static void main(String[] args){
        String s = new String();
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter String:");
        s = cs.nextLine();
        int count = 0;
        for(int i= 0; i< s.length()-1; i++){
            char c = s.charAt(i);
            char d = s.charAt(i+1);
            if(c == ' ' && d != ' '){
                count++;
            }
        }
        System.out.println("Total words = "+ count);
    }
}