public class BuggyCalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        System.out.println("DEBUG: a = " + a);
        System.out.println("DEBUG: b = " + b);
        
        int result = a / b;
        
        System.out.println("DEBUG: result after division = " + result);
        System.out.println("Final result: " + result);
    }
}
