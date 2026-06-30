public class BuggyArray {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78};
        
        // Try to find average
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            System.out.println("DEBUG: i = " + i + ", scores[i] = " + scores[i] + ", sum = " + sum);
        }
        
        int average = sum / scores.length;
        System.out.println("Average: " + average);
    }
}
