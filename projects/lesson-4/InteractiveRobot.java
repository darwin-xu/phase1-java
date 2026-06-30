import java.util.Scanner;

public class InteractiveRobot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Robot Control ===");
        System.out.print("Enter robot name: ");
        String robotName = scanner.nextLine();
        
        System.out.print("Enter battery level (0-100): ");
        int battery = scanner.nextInt();
        
        System.out.println();
        System.out.println("Robot: " + robotName);
        System.out.println("Battery: " + battery + "%");
        
        if (battery >= 50) {
            System.out.println("Status: Ready to operate");
        } else if (battery >= 20) {
            System.out.println("Status: Low battery - use with caution");
        } else {
            System.out.println("Status: CRITICAL - charge immediately!");
        }
    }
}
