import java.util.ArrayList;
import java.util.List;

// Base class
class Book {
    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Derived class for Fiction books
class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
        System.out.println("Category: Fiction");
    }
}

// Derived class for Non-Fiction books
class NonFiction extends Book {
    private String subject;

    public NonFiction(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Category: Non-Fiction");
    }
}

// Library Management System
public class LibraryManagement {
    private List<Book> books;

    public LibraryManagement() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayDetails();
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        // Adding books
        library.addBook(new Fiction("The Hobbit", "J.R.R. Tolkien", "978-0345339683", "Fantasy"));
        library.addBook(new NonFiction("A Brief History of Time", "Stephen Hawking", "978-0553380163", "Science"));

        // Displaying books
        System.out.println("Library Collection:");
        library.displayBooks();
    }
}
