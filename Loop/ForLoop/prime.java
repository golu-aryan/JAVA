/*write a program to print n prime numbers and find sum and average*/
public class prime {
    public static void main(String[] args) {
        int n = 0, i;
        System.out.println("Prime numbers from 1 to 100 are:");
        for(i = 1; i <= 100; i++){
            int count = 0;
            for(n = i; n>=1; n--){
                if (i%n==0){
                    count = count+1;
                }
                if(count==2){
                    System.out.println(i + " ");
                }
            }
        }
    }
}