/*write a program to sum of odd numbers between 1-100 */
class SumofOdd {
    public static void main(String[] args){
        int i,sum = 0;
        for(i = 0; i <= 100; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of 100 odd numbers are:-" + sum);
    }
}