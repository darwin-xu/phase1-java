public class UnfamiliarCode {

    public static void main(String[] args) {
        int[] burstReadings = {120, 118, 175, 117, 116};
        int result = selectStableReading(burstReadings);
        System.out.println("Chosen reading: " + result + " cm");
    }

    static int selectStableReading(int[] burstReadings) {
        int chosen = burstReadings[0];
        int smallestJump = Integer.MAX_VALUE;

        for (int i = 1; i < burstReadings.length; i++) {
            int jump = Math.abs(burstReadings[i] - burstReadings[i - 1]);

            if (jump < smallestJump) {
                smallestJump = jump;
                chosen = burstReadings[i];
            }
        }

        return chosen;
    }
}
