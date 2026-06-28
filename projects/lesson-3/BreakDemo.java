public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop ended");
    }
}
