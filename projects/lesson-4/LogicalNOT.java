/**
 * Logical NOT Operator
 * 
 * Demonstrates the NOT (!) operator which negates/flips a boolean value.
 * Useful for expressing the opposite of a condition.
 */

public class LogicalNOT {
    public static void main(String[] args) {
        System.out.println("=== Logical NOT Operator (!) ===\n");
        
        // Example 1: Simple NOT
        System.out.println("1. Simple NOT:");
        boolean isObstacleDetected = true;
        System.out.println("Obstacle detected: " + isObstacleDetected);
        System.out.println("Path is clear: " + !isObstacleDetected);
        System.out.println();
        
        if (!isObstacleDetected) {
            System.out.println("→ Moving forward");
        } else {
            System.out.println("→ Stopping!");
        }
        System.out.println();
        
        // Example 2: NOT with comparison
        System.out.println("2. NOT with comparison:");
        int battery = 25;
        System.out.println("Battery: " + battery + "%");
        System.out.println("Battery is low (< 20): " + (battery < 20));
        System.out.println("Battery is OK (not < 20): " + !(battery < 20));
        System.out.println();
        
        // Example 3: Robot state
        System.out.println("3. Robot State Check:");
        boolean isMoving = false;
        System.out.println("Is moving: " + isMoving);
        System.out.println("Is stopped: " + !isMoving);
        
        if (!isMoving) {
            System.out.println("→ Robot is stationary");
        } else {
            System.out.println("→ Robot is moving");
        }
        System.out.println();
        
        // Example 4: Double negation (two NOTs)
        System.out.println("4. Double Negation (!!):");
        boolean hasMotor = true;
        System.out.println("Has motor: " + hasMotor);
        System.out.println("NOT has motor: " + !hasMotor);
        System.out.println("NOT (NOT has motor): " + !!hasMotor);
        System.out.println("Notice: !!p = p (double negation gives back original)\n");
        
        // Example 5: Practical NOT usage
        System.out.println("5. Practical Example - Safety Check:");
        boolean calibrationSuccessful = true;
        
        if (!calibrationSuccessful) {
            System.out.println("ERROR: Calibration failed!");
            System.out.println("Cannot proceed with operation");
        } else {
            System.out.println("✓ Calibration successful");
            System.out.println("✓ Ready to operate");
        }
    }
}
