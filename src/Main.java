import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   // static Node head = null; // start of the list

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nToDo List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            // Use if/else or switch for options
            switch (choice) {
                case 1:
                    // Add task code
                    break;
                case 2:
                    // View tasks code
                    break;
                case 3:
                    // Delete task code
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}


