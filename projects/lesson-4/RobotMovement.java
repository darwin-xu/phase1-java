public class RobotMovement {
    public static void main(String[] args) {
        int distanceTraveled = 0;
        int targetDistance = 100; // cm
        
        while (distanceTraveled < targetDistance) {
            System.out.println("Moving... Distance: " + distanceTraveled + " cm");
            distanceTraveled = distanceTraveled + 25;
        }
        
        System.out.println("Reached target! Distance: " + distanceTraveled + " cm");
    }
}
