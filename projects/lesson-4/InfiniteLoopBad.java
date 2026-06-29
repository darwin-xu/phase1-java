public class InfiniteLoopBad {
    public static void main(String[] args) {
        int count = 1;
        
        while (count <= 5) {
            System.out.println("Count: " + count);
            // FORGOT to increment count!
            // count = count + 1;  // MISSING THIS LINE
        }
    }
}
