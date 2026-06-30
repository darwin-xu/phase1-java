public class Patterns {
    public static void main(String[] args) {
        // Square pattern
        System.out.println("Square (5x5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Triangle pattern
        System.out.println("Triangle:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
