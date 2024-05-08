//Write a program to check the key value is present or not in array elements by linear searching algorithm
class LinearSearch {
    public static boolean linearSearch(int a[], int n, int key){
        for(int i = 0; i< n ; i++){
            if(a[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,10,40};

        int x = 10;

        int n = arr.length;

        boolean result = linearSearch(arr, n, x);
        System.out.println("Is the key present? " + result);
    }
}