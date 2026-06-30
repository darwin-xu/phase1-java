import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        
        try {
            int number = Integer.parseInt(input);  // Convert string to int
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
