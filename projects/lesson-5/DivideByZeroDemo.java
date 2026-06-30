public class DivideByZeroDemo {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;
            
            int result = dividend / divisor;  // Divide by zero!
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
