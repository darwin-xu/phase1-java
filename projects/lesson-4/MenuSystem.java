import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            // Display menu
            System.out.println();
            System.out.println("=== Robot Task Menu ===");
            System.out.println("1. Move forward");
            System.out.println("2. Turn left");
            System.out.println("3. Turn right");
            System.out.println("4. Stop");
            System.out.println("5. Quit");
            System.out.print("Choose a task (1-5): ");
            
            // Get user choice
            int choice = scanner.nextInt();
            
            // Execute chosen action
            if (choice == 1) {
                System.out.println("→ Robot moving forward");
            } else if (choice == 2) {
                System.out.println("↻ Robot turning left");
            } else if (choice == 3) {
                System.out.println("↺ Robot turning right");
            } else if (choice == 4) {
                System.out.println("⏹ Robot stopped");
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
