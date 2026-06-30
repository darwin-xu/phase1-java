public class NestedLoopTable {
    public static void main(String[] args) {
        System.out.println("Times Table (1-3)");
        System.out.println();
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                int product = i * j;
                System.out.print(product + " ");
            }
            System.out.println(); // Move to next line
        }
    }
}
