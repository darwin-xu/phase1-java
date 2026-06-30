public class ExceptionInfo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception type: " + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Full details:");
            e.printStackTrace();
        }
    }
}
