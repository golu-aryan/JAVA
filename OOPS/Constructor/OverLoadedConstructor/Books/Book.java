package JAVA.OOPS.Constructor.OverLoadedConstructor.Books;

public class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Untitled";
        author = "Unknown";
        price = 0.0;
    }
    Book (String title, String author) {
        this.title = title;
        this.author = author;
        price = 100.0;
    }
    Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
