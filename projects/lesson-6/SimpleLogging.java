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
        info("Program started");
        
        int x = 5;
        debug("x = " + x);
        
        x = x * 2;
        debug("After multiply: x = " + x);
        
        info("Program finished");
    }
}
