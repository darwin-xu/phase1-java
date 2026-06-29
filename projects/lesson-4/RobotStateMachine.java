import java.util.Scanner;

public class RobotStateMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Robot state
        String state = "IDLE";
        
        while (true) {
            System.out.println();
            System.out.println("Current state: " + state);
            System.out.println("Commands: start, stop, charge, status, quit");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("start")) {
                if (state.equals("IDLE")) {
                    state = "MOVING";
                    System.out.println("→ Robot started");
                } else {
                    System.out.println("❌ Cannot start - already " + state);
                }
            } else if (command.equals("stop")) {
                if (state.equals("MOVING")) {
                    state = "IDLE";
                    System.out.println("⏹ Robot stopped");
                } else {
                    System.out.println("❌ Cannot stop - not moving");
                }
            } else if (command.equals("charge")) {
                state = "CHARGING";
                System.out.println("🔌 Robot charging");
            } else if (command.equals("status")) {
                System.out.println("Status: " + state);
            } else if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("❌ Unknown command");
            }
        }
    }
}
