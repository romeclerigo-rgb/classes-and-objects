import java.util.*;


public class ChoiceValidation {

    public int getMenuChoice(Scanner sc) {

        while (true) {

            try {
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice >= 1 && choice <= 4) {
                    return choice;
                }

                System.out.println("Please enter a number from 1 to 4.");
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            }
        }
    }
}