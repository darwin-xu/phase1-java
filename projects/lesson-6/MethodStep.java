public class MethodStep {
    
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println(result);
    }
}
