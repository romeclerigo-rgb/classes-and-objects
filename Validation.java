import java.util.*;
import java.time.Year;

public class Validation {

    public String validateTitle(Scanner sc) {

        boolean valid = false;
        String title = "";

        while (!valid) {

            System.out.print("Enter Title: ");
            title = sc.nextLine().trim();

            if (title.isEmpty()) {
                System.out.println("Title cannot be empty.");
            }
            else if (title.length() > 100) {
                System.out.println("Title is too long.");
            }
            else {
                valid = true;
            }
        }

        return title;
    }

    public String validateAuthor(Scanner sc) {

        boolean valid = false;
        String author = "";

        while (!valid) {

            System.out.print("Enter Author: ");
            author = sc.nextLine().trim();

            if (author.isEmpty()) {
                System.out.println("Author cannot be empty.");
            }
            else if (!author.matches("[a-zA-Z .'-]+")) {
                System.out.println("Invalid author name.");
            }
            else {
                valid = true;
            }
        }

        return author;
    }

    public int validateYear(Scanner sc) {

        boolean valid = false;
        int year = 0;

        while (!valid) {

            System.out.print("Enter Year: ");
            String input = sc.nextLine();

            if (!input.matches("\\d{4}")) {
                System.out.println("Year must be a 4-digit number.");
            }
            else {

                year = Integer.parseInt(input);

                if (year < 1000 || year > Year.now().getValue()) {
                    System.out.println("Invalid year.");
                }
                else {
                    valid = true;
                }
            }
        }

        return year;
    }

    public String validateSearch(Scanner sc) {

        boolean valid = false;
        String search = "";

        while (!valid) {

            System.out.print("Enter Title to Search: ");
            search = sc.nextLine().trim();

            if (search.isEmpty()) {
                System.out.println("Search cannot be empty.");
            }
            else {
                valid = true;
            }
        }

        return search;
    }
}