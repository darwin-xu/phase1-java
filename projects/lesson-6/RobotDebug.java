public class RobotDebug {
    public static void main(String[] args) {
        // Simulate robot movement
        int x = 0;
        int y = 0;
        
        System.out.println("DEBUG: Starting position: (" + x + ", " + y + ")");
        
        // Move right 3 times
        for (int i = 0; i < 3; i++) {
            x = x + 1;
            System.out.println("DEBUG: After move " + (i+1) + ": (" + x + ", " + y + ")");
        }
        
        // Move up 2 times
        for (int i = 0; i < 2; i++) {
            y = y + 1;
            System.out.println("DEBUG: After move " + (i+1) + ": (" + x + ", " + y + ")");
        }
        
        System.out.println("Final position: (" + x + ", " + y + ")");
    }
}
