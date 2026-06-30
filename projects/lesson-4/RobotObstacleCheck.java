public class RobotObstacleCheck {
    public static void main(String[] args) {
        int distanceToObstacle = 15; // in centimeters
        int safeDistance = 20;
        
        System.out.println("Distance to obstacle: " + distanceToObstacle + " cm");
        
        if (distanceToObstacle < safeDistance) {
            System.out.println("OBSTACLE DETECTED - Stop the robot!");
        }
        
        System.out.println("Safety check complete");
    }
}
