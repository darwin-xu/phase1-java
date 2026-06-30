public class FinallyDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            int result = 10 / 2;  // No exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block (always runs!)");
        }
        
        System.out.println("After try/catch/finally");
    }
}
