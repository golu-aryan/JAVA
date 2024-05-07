public class evenlength {
    public static void printWords(String s) {
        for(String word :  s.split(" ")) {
            if (word.length() % 2 == 0){
                System.out.println(word);
            } else{
                System.out.println("Not an even length word: " + word);
            }
    }
}
    public static void main(String[] args) {
        String str = "Son of Gotham";
        printWords(str);
    }
}
