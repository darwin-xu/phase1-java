import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!");
    }
}
