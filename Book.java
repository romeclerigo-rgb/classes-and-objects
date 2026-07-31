import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static Book createBook(Scanner sc, Validation validation) {

        String title = validation.validateTitle(sc);
        String author = validation.validateAuthor(sc);
        int year = validation.validateYear(sc);

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