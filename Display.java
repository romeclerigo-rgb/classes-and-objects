import java.util.ArrayList;

public class Display {

    public void displayBooks(ArrayList<Book> books) {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

      
        System.out.println("========================================================");
        System.out.printf("%-25s %-20s %-6s%n", "Title", "Author", "Year");
        System.out.println("========================================================");

        // Display each book
        for (Book book : books) {
            System.out.printf("%-25s %-20s %-6d%n",
                    book.getTitle(),
                    book.getAuthor(),
                    book.getYear());
        }

        // Bottom border
        System.out.println("========================================================\n");
    }
}