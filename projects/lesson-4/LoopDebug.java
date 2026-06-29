public class LoopDebug {
    public static void main(String[] args) {
        int count = 1;
        
        while (count <= 3) {
            System.out.println("Iteration " + count);
            count = count + 1;
            System.out.println("  count is now: " + count);
        }
        
        System.out.println("Final count: " + count);
    }
}
