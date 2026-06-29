public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Before try/catch");
        
        try {
            System.out.println("Inside try block");
            int x = 10 / 0;  // This will throw ArithmeticException
            System.out.println("After division (won't print)");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        
        System.out.println("After try/catch - program continues!");
    }
}
