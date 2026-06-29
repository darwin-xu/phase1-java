public class UnfamiliarCode {
    
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1, 9};
        int result = mysteryFunction(data);
        System.out.println("Result: " + result);
    }
    
    // What does this do?
    static int mysteryFunction(int[] arr) {
        int r = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > r) {
                r = arr[i];
            }
        }
        return r;
    }
}
