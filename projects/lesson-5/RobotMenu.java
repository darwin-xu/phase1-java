import java.util.Scanner;

public class RobotMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            try {
                System.out.println();
                System.out.println("=== Robot Control Panel ===");
                System.out.println("1. Set motor speed");
                System.out.println("2. Read sensor");
                System.out.println("3. Quit");
                System.out.print("Choose option: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                
                if (choice == 1) {
                    System.out.print("Enter speed (-100 to 100): ");
                    String speedStr = scanner.nextLine();
                    int speed = Integer.parseInt(speedStr);
                    
                    if (speed >= -100 && speed <= 100) {
                        System.out.println("✓ Motor set to " + speed);
                    } else {
                        System.out.println("✗ Speed out of range");
                    }
                    
                } else if (choice == 2) {
                    System.out.println("✓ Sensor reading: 42 cm");
                    
                } else if (choice == 3) {
                    running = false;
                    System.out.println("Goodbye!");
                    
                } else {
                    System.out.println("Invalid option");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numbers");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
