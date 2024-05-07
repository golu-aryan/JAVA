import java.util.Scanner;

public class neg {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter Array elements:");
        int e[] = new int[n];
        for (int i=0 ;i<n; i++){
            e[i] = sc.nextInt();
        }     
        System.out.println("Negative Numbers are:");  
        for(int i = 0;i<n; i++){
            if(e[i] < 0){
                System.out.print(e[i]);
            }
        }
        sc.close();
    }
}
