package JAVA.OOPS.Constructor.OverLoadedConstructor.Books;

import java.util.Scanner;

public class bookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Title :-> ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Author Name :-> ");
        String author = scanner.nextLine();

        System.out.print("Enter Book Price :-> ");
        double price = scanner.nextDouble();

        Book book1 = new Book();
        System.out.println("------    Books Details    ------");
        System.out.println("Book's Title :> " + book1.title);
        System.out.println("Book's Author :> " + book1.author);
        System.out.println("Book's Price :> " + book1.price);
        System.out.println("---------------------------------");

        Book book2 = new Book(title, author);
        System.out.println("------    Books Details    ------");
        System.out.println("Book's Title :> " + book2.title);
        System.out.println("Book's Author :> " + book2.author);
        System.out.println("Book's Price :> " + book2.price);
        System.out.println("---------------------------------");

        Book book3 = new Book(title, author, price);
        System.out.println("------    Books Details    ------");
        System.out.println("Book's Title :> " + book3.title);
        System.out.println("Book's Author :> " + book3.author);
        System.out.println("Book's Price :> " + book3.price);
        System.out.println("---------------------------------");
        scanner.close();
    }
}
