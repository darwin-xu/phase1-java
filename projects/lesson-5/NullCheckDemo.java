public class NullCheckDemo {
    
    // Method that might return null
    static String getSensorName() {
        // Simulate sensor that might not exist
        return null;
    }
    
    // BAD: Doesn't check for null
    static void badWay() {
        String sensorName = getSensorName();
        System.out.println(sensorName.length());  // CRASH if null
    }
    
    // GOOD: Checks for null first
    static void goodWay() {
        String sensorName = getSensorName();
        
        if (sensorName != null) {
            System.out.println(sensorName.length());
        } else {
            System.out.println("Sensor not available");
        }
    }
    
    public static void main(String[] args) {
        // badWay();  // Would crash
        goodWay();   // Handles null gracefully
    }
}
