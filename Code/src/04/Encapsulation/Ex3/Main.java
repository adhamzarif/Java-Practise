package Week_04.Encapsulation.Ex3;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Author author = new Author("John Doe", "9034092138", "jdoe@gmail.com");
        Book book1 = new Book(18191991, "How to die", author);
        Book book2 = new Book(18191992, "How to die 2", author);
        Book book3 = new Book(18191993, "How to die 3", author);
        Book book4 = new Book(18191994, "How to die 4", author);

        Library library = new Library("Dhaka");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.print("Enter ISBN: ");
        long isbn = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Book title: ");
        String title = sc.nextLine();

        Book book5 = new Book(isbn, title, author);

        library.addBook(book5);

        library.showAllBooks();

        library.removeBook(book3);

        library.showAllBooks();

    }
}
