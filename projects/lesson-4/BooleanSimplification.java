/**
 * Boolean Expression Simplification
 * 
 * Demonstrates how to simplify Boolean expressions using:
 * - De Morgan's Laws
 * - Double negation
 * - Commutative properties
 * - Practical simplification for robot logic
 */

public class BooleanSimplification {
    public static void main(String[] args) {
        System.out.println("=== Boolean Expression Simplification ===\n");
        
        // Example 1: Double Negation
        System.out.println("1. Double Negation Law: !!p = p");
        boolean p = true;
        System.out.println("p = " + p);
        System.out.println("!!p = " + (!(!p)));
        System.out.println("They are equal: " + (p == (!(!p))));
        System.out.println();
        
        // Example 2: De Morgan's Law Simplification
        System.out.println("2. Simplifying Complex Expressions with De Morgan's Law");
        System.out.println("Original: !(isRaining && isMoving)");
        System.out.println("Simplified: !isRaining || !isMoving");
        
        boolean isRaining = false;
        boolean isMoving = true;
        
        boolean original = !(isRaining && isMoving);
        boolean simplified = !isRaining || !isMoving;
        
        System.out.println("isRaining = " + isRaining + ", isMoving = " + isMoving);
        System.out.println("Original expression result: " + original);
        System.out.println("Simplified expression result: " + simplified);
        System.out.println("Both are equal: " + (original == simplified));
        System.out.println();
        
        // Example 3: Robot Logic - Why Simplification Matters
        System.out.println("3. Robot Control Logic Example");
        System.out.println("Problem: Stop robot if NOT (has power AND has wheels AND is calibrated)");
        System.out.println("Original condition: !(hasPower && hasWheels && isCalibrated)");
        System.out.println("Simplified: !hasPower || !hasWheels || !isCalibrated");
        System.out.println("Meaning: Stop if ANY of these is missing\n");
        
        boolean hasPower = true;
        boolean hasWheels = true;
        boolean isCalibrated = false;
        
        boolean robotOriginal = !(hasPower && hasWheels && isCalibrated);
        boolean robotSimplified = !hasPower || !hasWheels || !isCalibrated;
        
        System.out.println("Scenario: hasPower=" + hasPower + ", hasWheels=" + hasWheels 
                         + ", isCalibrated=" + isCalibrated);
        System.out.println("Stop robot? (original) " + robotOriginal);
        System.out.println("Stop robot? (simplified) " + robotSimplified);
        System.out.println("Both strategies give same result: " + (robotOriginal == robotSimplified));
        System.out.println();
        
        // Example 4: Commutative Property
        System.out.println("4. Commutative Property: a && b = b && a");
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("b && a = " + (b && a));
        System.out.println("Same result: " + ((a && b) == (b && a)));
        System.out.println();
        
        // Example 5: Associative Property
        System.out.println("5. Associative Property: (a && b) && c = a && (b && c)");
        boolean c = true;
        System.out.println("(a && b) && c = " + ((a && b) && c));
        System.out.println("a && (b && c) = " + (a && (b && c)));
        System.out.println("Same result: " + (((a && b) && c) == (a && (b && c))));
    }
}
