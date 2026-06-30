public class InfiniteLoopFixed {
    public static void main(String[] args) {
        int count = 1;
        
        while (count <= 5) {
            System.out.println("Count: " + count);
            count = count + 1;  // NOW we have the increment
        }
    }
}
