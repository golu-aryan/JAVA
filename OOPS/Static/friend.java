
class friends {
    String name;
    static int numberofFriends;

    friends(String name) {
        this.name = name;
        numberofFriends++;
    }

    static void displayFirend() {
        System.out.println("You have " + numberofFriends + " freinds");
    }
}

public class friend {


    public static void main(String[] args) {

        friends f1 = new friends("Aryan");
        friends f2 = new friends("Patrick Bateman");

        // System.out.println(friends.numberofFriends);
        friends.displayFirend();

    }
}
