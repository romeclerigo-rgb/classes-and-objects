import java.util.*;


public class Search {

    Validation validation = new Validation();
    
    public void searchBook(ArrayList<Book> books, Scanner sc){

    String keyword = validation.validateSearch(sc);

    boolean found = false;
        if (books.isEmpty()) {
        System.out.println("No books available.");
        return;
    }
    
    for (Book book : books) {
        
        if (book.getTitle().equalsIgnoreCase(keyword) ||
            book.getAuthor().equalsIgnoreCase(keyword)) {

            System.out.println("\n-----------------------------");
            System.out.println("Book Found!");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println("-----------------------------\n");
            found = true;
        }
    }

    if (!found) {
        System.out.println("No matching book found.");
    }
}
}