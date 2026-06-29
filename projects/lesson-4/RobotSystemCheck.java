public class RobotSystemCheck {
    public static void main(String[] args) {
        // Simulate robot sensors
        boolean powerOn = true;
        boolean motorConnected = true;
        boolean sensorCalibrated = true;
        
        System.out.println("=== Robot System Check ===");
        
        if (powerOn) {
            System.out.println("✓ Power: ON");
            
            if (motorConnected) {
                System.out.println("✓ Motor: Connected");
                
                if (sensorCalibrated) {
                    System.out.println("✓ Sensor: Calibrated");
                    System.out.println("\n🤖 ROBOT READY!");
                } else {
                    System.out.println("✗ Sensor: Not calibrated");
                }
            } else {
                System.out.println("✗ Motor: Disconnected");
            }
        } else {
            System.out.println("✗ Power: OFF");
        }
    }
}
