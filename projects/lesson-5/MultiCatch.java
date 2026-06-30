import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);  // Could throw NumberFormatException
            
            System.out.print("Enter divisor: ");
            String divisorStr = scanner.nextLine();
            int divisor = Integer.parseInt(divisorStr);  // Could throw NumberFormatException
            
            int result = number / divisor;  // Could throw ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        
        System.out.println("Program continues");
    }
}
