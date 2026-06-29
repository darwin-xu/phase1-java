/**
 * De Morgan's Laws
 * 
 * Demonstrates De Morgan's Laws which are fundamental Boolean algebra rules:
 * - !(p && q) = !p || !q
 * - !(p || q) = !p && !q
 * 
 * These laws are useful for simplifying complex Boolean expressions.
 */

public class DeMorgansLaws {
    public static void main(String[] args) {
        System.out.println("=== De Morgan's Laws ===\n");
        
        // Test all combinations of p and q
        System.out.println("Verification with all truth value combinations:\n");
        
        System.out.println("De Morgan's Law 1: !(p && q) = !p || !q");
        System.out.println("|   p   |   q   | !(p&&q) | !p || !q | Equal? |");
        System.out.println("|-------|-------|---------|----------|--------|");
        verifyLaw1(true, true);
        verifyLaw1(true, false);
        verifyLaw1(false, true);
        verifyLaw1(false, false);
        System.out.println();
        
        System.out.println("De Morgan's Law 2: !(p || q) = !p && !q");
        System.out.println("|   p   |   q   | !(p||q) | !p && !q | Equal? |");
        System.out.println("|-------|-------|---------|----------|--------|");
        verifyLaw2(true, true);
        verifyLaw2(true, false);
        verifyLaw2(false, true);
        verifyLaw2(false, false);
        System.out.println();
        
        // Practical robotics example
        System.out.println("=== Practical Robot Example ===\n");
        System.out.println("Original condition: !(hasMotor && canMove)");
        System.out.println("Using De Morgan's Law: !hasMotor || !canMove\n");
        
        System.out.println("Both expressions are equivalent:");
        System.out.println("|hasMotor|canMove| !(hasMotor && canMove) | !hasMotor || !canMove |");
        System.out.println("|--------|-------|----------------------|----------------------|");
        robotExample(true, true);
        robotExample(true, false);
        robotExample(false, true);
        robotExample(false, false);
    }
    
    static void verifyLaw1(boolean p, boolean q) {
        boolean left = !(p && q);
        boolean right = !p || !q;
        boolean equal = (left == right);
        System.out.printf("| %-5s | %-5s | %-7s | %-8s | %-6s |%n", p, q, left, right, equal);
    }
    
    static void verifyLaw2(boolean p, boolean q) {
        boolean left = !(p || q);
        boolean right = !p && !q;
        boolean equal = (left == right);
        System.out.printf("| %-5s | %-5s | %-7s | %-8s | %-6s |%n", p, q, left, right, equal);
    }
    
    static void robotExample(boolean hasMotor, boolean canMove) {
        boolean original = !(hasMotor && canMove);
        boolean simplified = !hasMotor || !canMove;
        System.out.printf("|%-8s|%-7s| %-22s | %-22s |%n", hasMotor, canMove, original, simplified);
    }
}
