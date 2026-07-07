public class BuggyCalculator {
    public static void main(String[] args) {
        int remainingDistanceCm = 95;
        int driveSpeedCmPerSecond = 40;

        System.out.println("DEBUG: remainingDistanceCm = " + remainingDistanceCm);
        System.out.println("DEBUG: driveSpeedCmPerSecond = " + driveSpeedCmPerSecond);

        double travelTimeSeconds = remainingDistanceCm / driveSpeedCmPerSecond;

        System.out.println("DEBUG: travelTimeSeconds = " + travelTimeSeconds);
        System.out.println("Estimated travel time: " + travelTimeSeconds + " s");
    }
}
