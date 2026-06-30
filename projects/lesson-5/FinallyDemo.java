public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            int result = 10 / 0;  // Exception
            System.out.println("After exception (won't print)");
        } catch (ArithmeticException e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block (always runs!)");
        }
        
        System.out.println("After try/catch/finally");
    }
}
