/**
 * Truth Tables for Boolean Operators
 * 
 * Demonstrates truth tables for:
 * - NOT (!)
 * - AND (&&)
 * - OR (||)
 * - XOR (exclusive or, simulated with !=)
 */

public class TruthTables {
    public static void main(String[] args) {
        System.out.println("=== Truth Tables ===\n");
        
        // Truth table for NOT
        System.out.println("1. NOT Operator (!)");
        System.out.println("| p     | !p    |");
        System.out.println("|-------|-------|");
        printNotRow(true);
        printNotRow(false);
        System.out.println();
        
        // Truth table for AND
        System.out.println("2. AND Operator (&&)");
        System.out.println("| p     | q     | p && q |");
        System.out.println("|-------|-------|--------|");
        printAndRow(true, true);
        printAndRow(true, false);
        printAndRow(false, true);
        printAndRow(false, false);
        System.out.println();
        
        // Truth table for OR
        System.out.println("3. OR Operator (||)");
        System.out.println("| p     | q     | p || q |");
        System.out.println("|-------|-------|--------|");
        printOrRow(true, true);
        printOrRow(true, false);
        printOrRow(false, true);
        printOrRow(false, false);
        System.out.println();
        
        // Truth table for NAND (NOT AND)
        System.out.println("4. NAND Operator (!(p && q))");
        System.out.println("| p     | q     | !(p&&q) |");
        System.out.println("|-------|-------|---------|");
        printNandRow(true, true);
        printNandRow(true, false);
        printNandRow(false, true);
        printNandRow(false, false);
        System.out.println();
        
        // Truth table for NOR (NOT OR)
        System.out.println("5. NOR Operator (!(p || q))");
        System.out.println("| p     | q     | !(p||q) |");
        System.out.println("|-------|-------|---------|");
        printNorRow(true, true);
        printNorRow(true, false);
        printNorRow(false, true);
        printNorRow(false, false);
    }
    
    static void printNotRow(boolean p) {
        System.out.printf("| %-5s | %-5s |%n", p, !p);
    }
    
    static void printAndRow(boolean p, boolean q) {
        System.out.printf("| %-5s | %-5s | %-6s |%n", p, q, (p && q));
    }
    
    static void printOrRow(boolean p, boolean q) {
        System.out.printf("| %-5s | %-5s | %-6s |%n", p, q, (p || q));
    }
    
    static void printNandRow(boolean p, boolean q) {
        System.out.printf("| %-5s | %-5s | %-7s |%n", p, q, !(p && q));
    }
    
    static void printNorRow(boolean p, boolean q) {
        System.out.printf("| %-5s | %-5s | %-7s |%n", p, q, !(p || q));
    }
}
