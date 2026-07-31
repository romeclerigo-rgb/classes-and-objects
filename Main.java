import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        boolean loop = true;

        Display display = new Display();
        Search search = new Search();
        Validation validation = new Validation();


        while(loop) {
            System.out.println("========================================================");
            System.out.println("\t\tLibrary Inventory Program");
            System.out.println("========================================================\n");
            System.out.println("Actions: ");
            System.out.println("1. Add Books");
            System.out.println("2. Search Books");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            
            int choice = validation.getMenuChoice(sc);

            switch (choice) {
                case 1:
                    Book newBook = Book.createBook(sc, validation);
                    books.add(newBook);
                    System.out.println("Book added successfully!\n");
                    break;
                case 2:
                    search.searchBook(books);   
                    break;
                case 3:
                    display.displayBooks(books);
                    break;
                case 4:
                    loop = false;
                    System.out.println("Program Exited!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
