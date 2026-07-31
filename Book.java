import java.util.*;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static Book createBook(Scanner sc, Validation validation, ArrayList<Book> books) {

        boolean validBook = false;
        String title = "";
        String author = "";
        int year = 0;

        while (!validBook) {

            title = validation.validateTitle(sc);
            author = validation.validateAuthor(sc);
            year = validation.validateYear(sc);

            if (validation.isDuplicateBook(books, title, author, year)) {
                System.out.println("This book already exists.");
            } else {
                validBook = true;
        }
    }

    return new Book(title, author, year);
}

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}