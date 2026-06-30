public class BuggyRobot2 {
    public static void main(String[] args) {
        int totalSteps = 0;
        
        // Right
        for (int i = 0; i < 5; i++) {
            totalSteps = totalSteps + 1;
        }
        System.out.println("Right done. Total: " + totalSteps);
        
        // Up
        for (int i = 0; i < 5; i++) {
            totalSteps = totalSteps + 1;
        }
        System.out.println("Up done. Total: " + totalSteps);
        
        // Left - BUG HERE
        for (int i = 0; i < 5; i++) {
            totalSteps = totalSteps + 2;  // WRONG: adds 2 each time
        }
        System.out.println("Left done. Total: " + totalSteps);
        
        // Down
        for (int i = 0; i < 5; i++) {
            totalSteps = totalSteps + 1;
        }
        System.out.println("Down done. Total: " + totalSteps);
        
        System.out.println("\nExpected: 20, Actual: " + totalSteps);
    }
}
