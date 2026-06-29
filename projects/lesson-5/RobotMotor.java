public class RobotMotor {
    
    static void setMotorSpeed(int speed) {
        // Simulate motor that needs speed between -100 and 100
        if (speed < -100 || speed > 100) {
            throw new IllegalArgumentException("Speed must be -100 to 100");
        }
        System.out.println("Motor speed set to: " + speed);
    }
    
    static void safeSetMotorSpeed(int speed) {
        try {
            setMotorSpeed(speed);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        safeSetMotorSpeed(50);    // Valid
        safeSetMotorSpeed(150);   // Invalid - caught and handled
        safeSetMotorSpeed(-75);   // Valid
    }
}
