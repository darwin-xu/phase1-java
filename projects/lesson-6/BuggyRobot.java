public class BuggyRobot {
    public static void main(String[] args) {
        // Robot patrol: move in a square
        // Should move: right 5, up 5, left 5, down 5
        
        int totalSteps = 0;
        
        // Right 5
        totalSteps = totalSteps + 5;
        System.out.println("Moved right. Total steps: " + totalSteps);
        
        // Up 5
        totalSteps = totalSteps + 5;
        System.out.println("Moved up. Total steps: " + totalSteps);
        
        // Left 5
        totalSteps = totalSteps + 5;
        System.out.println("Moved left. Total steps: " + totalSteps);
        
        // Down 5
        totalSteps = totalSteps + 5;
        System.out.println("Moved down. Total steps: " + totalSteps);
        
        // Expected: 20 steps total
        System.out.println("\nExpected: 20, Actual: " + totalSteps);
    }
}
