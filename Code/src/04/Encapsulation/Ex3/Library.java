package Week_04.Encapsulation.Ex3;

public class Library {
    private String location;
    private Book[] books;
    private int numBooks;

    public Library(String location) {
        this.location = location;
        this.books = new Book[100];
        numBooks = 0;
    }

    public void addBook(Book book) {
        this.books[numBooks++] = book;
    }

    public void removeBook(Book book) {
        int i;
        for (i = 0; i < numBooks; i++) {
            if (books[i].getIsbn() == book.getIsbn()) {
                break;
            }
        }

        if (i >= numBooks) {
            System.out.println("Book not found!");
            return;
        }

        for(int j = i; j < numBooks; ++j) {
            books[j] = books[j + 1];
        }
        numBooks--;
    }

    public void showAllBooks() {
        for(int i = 0; i < numBooks; ++i) {
            this.books[i].printBookDetails();
            System.out.println("==========================================");
        }
    }

    public int getNumBooks() {
        return numBooks;
    }

    public void setNumBooks(int numBooks) {
        this.numBooks = numBooks;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
