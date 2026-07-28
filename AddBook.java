import java.util.Scanner;

public class AddBook {

    Validation validation = new Validation();

    public Book inputDetails(Scanner sc) {

        String title = validation.validateTitle(sc);
        String author = validation.validateAuthor(sc);
        int year = validation.validateYear(sc);

        return new Book(title, author, year);
    }
}