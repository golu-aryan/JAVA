
class age {
    // Create a method
    public int yourAge(int n) {
        if (n > 18) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // creating an object of age
        age obj = new age();
        int r = obj.yourAge(19);
        System.out.println(r);
    }
}