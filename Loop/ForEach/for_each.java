class for_each {
    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];
        // for each loop
        for (int num : numbers) {
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] marks = { 12, 33, 44, 55, 66 };

        int highest_marks = maximum(marks);

        System.out.println("The highest number is:" + highest_marks);
    }
}