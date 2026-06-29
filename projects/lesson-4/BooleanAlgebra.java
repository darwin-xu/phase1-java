/**
 * Boolean Algebra Fundamentals
 * 
 * Demonstrates basic Boolean algebra concepts:
 * - Boolean variables and values
 * - Truth tables for AND, OR, NOT
 * - Boolean expressions
 */

public class BooleanAlgebra {
    public static void main(String[] args) {
        System.out.println("=== Boolean Algebra Fundamentals ===\n");
        
        // 1. Basic Boolean Values
        System.out.println("1. Boolean Variables:");
        boolean p = true;
        boolean q = false;
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println();
        
        // 2. NOT Operator (!)
        System.out.println("2. NOT Operator (!):");
        System.out.println("!p = !" + p + " = " + (!p));
        System.out.println("!q = !" + q + " = " + (!q));
        System.out.println();
        
        // 3. AND Operator (&&)
        System.out.println("3. AND Operator (&&):");
        System.out.println("p && p = " + p + " && " + p + " = " + (p && p));
        System.out.println("p && q = " + p + " && " + q + " = " + (p && q));
        System.out.println("q && q = " + q + " && " + q + " = " + (q && q));
        System.out.println();
        
        // 4. OR Operator (||)
        System.out.println("4. OR Operator (||):");
        System.out.println("p || p = " + p + " || " + p + " = " + (p || p));
        System.out.println("p || q = " + p + " || " + q + " = " + (p || q));
        System.out.println("q || q = " + q + " || " + q + " = " + (q || q));
        System.out.println();
        
        // 5. Complex Boolean Expressions
        System.out.println("5. Complex Boolean Expressions:");
        System.out.println("(p && q) || !q = (" + p + " && " + q + ") || !" + q + " = " + ((p && q) || !q));
        System.out.println("!(p && q) = !(" + p + " && " + q + ") = " + (!(p && q)));
        System.out.println("!p || !q = !" + p + " || !" + q + " = " + (!p || !q));
        System.out.println();
        
        // 6. Verification of De Morgan's Law
        System.out.println("6. De Morgan's Law Example:");
        System.out.println("!(p && q) = " + (!(p && q)));
        System.out.println("!p || !q = " + (!p || !q));
        System.out.println("Are they equal? " + (!(p && q) == (!p || !q)));
    }
}
