public class RobotWithLogging {

    static final boolean DEBUG = true;

    static void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }

    static void debug(String message) {
        if (DEBUG) {
            log("DEBUG", message);
        }
    }

    static int readFrontDistance() {
        int distance = 68;
        debug("frontDistanceCm = " + distance);
        return distance;
    }

    static int readBatteryPercent() {
        int batteryPercent = 28;
        debug("batteryPercent = " + batteryPercent);
        return batteryPercent;
    }

    static int calculateDrivePower(int distance, int batteryPercent) {
        debug("Calculating drive power for distance=" + distance + ", battery=" + batteryPercent);

        if (distance < 40) {
            log("WARNING", "Obstacle too close, stopping robot");
            return 0;
        }

        if (batteryPercent < 30) {
            log("WARNING", "Battery low, limiting drive power");
            return 35;
        }

        return 60;
    }

    static void moveRobot(int drivePower) {
        log("INFO", "Commanding drive power " + drivePower + "%");
    }

    public static void main(String[] args) {
        log("INFO", "Robot program started");

        int distance = readFrontDistance();
        int batteryPercent = readBatteryPercent();
        int drivePower = calculateDrivePower(distance, batteryPercent);

        moveRobot(drivePower);

        log("INFO", "Robot program finished");
    }
}
