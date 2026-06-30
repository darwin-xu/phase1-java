public class SimpleLogging {

    static final boolean DEBUG = true;  // Change to false to turn off

    static void debug(String message) {
        if (DEBUG) {
            System.out.println("[DEBUG] " + message);
        }
    }

    static void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public static void main(String[] args) {
        info("Startup sequence started");

        int batteryPercent = 72;
        int activeMotors = 4;

        debug("batteryPercent = " + batteryPercent);
        debug("activeMotors = " + activeMotors);

        if (batteryPercent < 30) {
            info("Entering low-power mode");
        } else {
            info("Robot ready for teleop");
        }

        info("Startup sequence finished");
    }
}
