import java.util.Scanner;

public class InputTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Read a double
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        
        // Read a string (consume the newline first)
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
    }
}
