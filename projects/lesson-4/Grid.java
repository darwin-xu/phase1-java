public class Grid {
    public static void main(String[] args) {
        // Simulate a 3x3 game board
        System.out.println("Game Board:");
        System.out.println();
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("[ ] ");
            }
            System.out.println();
        }
    }
}
