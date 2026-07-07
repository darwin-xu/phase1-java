public class ObstacleResponsePlanner {
    static String chooseDriveMode(int[] frontDistancesCm) {
        int sum = 0;

        for (int i = 0; i < frontDistancesCm.length; i++) {
            sum = sum + frontDistancesCm[i];
        }

        double averageDistance = (double) sum / frontDistancesCm.length;
        String driveMode;

        // Subtle bug: strict > breaks exact-threshold cases at 120.0 cm and 60.0 cm.
        if (averageDistance > 120) {
            driveMode = "CRUISE";
        } else if (averageDistance > 60) {
            driveMode = "CAUTION";
        } else {
            driveMode = "STOP";
        }

        return "Average front distance: " + averageDistance + " cm, mode: " + driveMode;
    }

    public static void main(String[] args) {
        int[] hallwayRun = {140, 135, 130, 138};
        int[] boundaryCase = {120, 120, 120, 120};

        System.out.println(chooseDriveMode(hallwayRun));
        System.out.println(chooseDriveMode(boundaryCase));
    }
}