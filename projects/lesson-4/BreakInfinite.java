public class BreakInfinite {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;
            System.out.println("Count: " + count);
            if (count == 5) {
                break;
            }
        }
        System.out.println("Escaped loop");
    }
}
