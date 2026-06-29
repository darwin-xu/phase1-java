import java.util.Scanner;

public class RobustInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Defensive: validate before using
        System.out.print("Enter age (must be 1-120): ");
        String ageStr = scanner.nextLine();
        
        try {
            int age = Integer.parseInt(ageStr);
            
            if (age < 1 || age > 120) {
                System.out.println("Error: Age must be between 1 and 120");
            } else {
                System.out.println("Valid age: " + age);
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number");
        }
    }
}
