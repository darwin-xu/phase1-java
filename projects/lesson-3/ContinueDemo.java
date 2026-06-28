public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue;
            }
            System.out.println("Processing: " + i);
        }
    }
}
