public class BreakWhile {
    public static void main(String[] args) {
        int distance = 0;
        while (distance < 100) {
            distance += 10;
            System.out.println("Distance: " + distance);
            if (distance == 50) {
                System.out.println("Obstacle detected");
                break;
            }
        }
    }
}
