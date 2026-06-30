import java.util.Scanner;

public class RobotWithBattery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String state = "IDLE";
        double battery = 100.0;
        
        while (true) {
            // Show current status
            System.out.println();
            System.out.println("State: " + state + " | Battery: " + battery + "%");
            System.out.print("Command (start/move/stop/charge/quit): ");
            String command = scanner.nextLine();
            
            if (command.equals("start")) {
                if (battery > 10) {
                    state = "ACTIVE";
                    System.out.println("✓ Robot activated");
                } else {
                    System.out.println("✗ Battery too low!");
                }
            } else if (command.equals("move")) {
                if (state.equals("ACTIVE")) {
                    if (battery > 5) {
                        battery = battery - 10; // Use battery
                        System.out.println("→ Moving... (battery used)");
                    } else {
                        System.out.println("✗ Insufficient battery to move");
                    }
                } else {
                    System.out.println("✗ Not activated");
                }
            } else if (command.equals("stop")) {
                state = "IDLE";
                System.out.println("⏹ Stopped");
            } else if (command.equals("charge")) {
                battery = 100;
                System.out.println("🔌 Charged to 100%");
            } else if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
