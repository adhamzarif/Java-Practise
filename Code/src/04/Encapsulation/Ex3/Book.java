package Week_04.Encapsulation.Ex3;

public class Book {
    private long isbn;
    private String title;
    private Author author;

    public Book(long isbn, String title, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void printBookDetails() {
        System.out.println("Book title: "+this.title+"\nISBN: "+this.isbn);
        author.printAuthorDetails();
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
