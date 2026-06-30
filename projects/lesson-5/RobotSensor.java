import java.util.Scanner;

public class RobotSensor {
    
    static int readDistanceSensor() throws Exception {
        // Simulate sensor that might fail
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sensor reading (0-300): ");
        
        String input = scanner.nextLine();
        int distance = Integer.parseInt(input);
        
        if (distance < 0 || distance > 300) {
            throw new Exception("Invalid sensor reading: " + distance);
        }
        
        return distance;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("=== Robot Distance Sensor ===");
            int distance = readDistanceSensor();
            
            if (distance < 20) {
                System.out.println("⚠️  OBSTACLE VERY CLOSE!");
            } else if (distance < 50) {
                System.out.println("⚠️  Obstacle detected");
            } else {
                System.out.println("✓ Path is clear");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Sensor check complete");
        }
    }
}
