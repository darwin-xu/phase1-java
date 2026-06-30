import java.util.Scanner;

public class SmartErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
            
        } catch (NumberFormatException e) {
            // Provide helpful feedback
            System.out.println("Sorry, '" + e.getMessage() + "' is not a valid number");
            System.out.println("Please enter digits only");
        }
    }
}
