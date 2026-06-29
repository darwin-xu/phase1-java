public class RobotWithLogging {
    
    static final boolean DEBUG = true;
    
    static void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }
    
    static void debug(String message) {
        if (DEBUG) log("DEBUG", message);
    }
    
    static int readDistanceSensor() {
        int distance = 150;
        debug("Sensor read: " + distance + " cm");
        return distance;
    }
    
    static int calculateSpeed(int distance) {
        debug("Calculating speed for distance: " + distance);
        
        int speed;
        if (distance > 100) {
            speed = 50;
            debug("Distance > 100, setting speed to 50");
        } else {
            speed = 75;
            debug("Distance <= 100, setting speed to 75");
        }
        
        debug("Calculated speed: " + speed);
        return speed;
    }
    
    static void moveRobot(int speed) {
        log("INFO", "Moving robot at speed " + speed);
    }
    
    public static void main(String[] args) {
        log("INFO", "Robot program started");
        
        int distance = readDistanceSensor();
        int speed = calculateSpeed(distance);
        moveRobot(speed);
        
        log("INFO", "Robot program finished");
    }
}
