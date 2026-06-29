public class RobotState {
    public static void main(String[] args) {
        boolean movementEnabled = true;
        
        if (movementEnabled) {
            System.out.println("Motors: ON");
            System.out.println("Robot is moving");
        } else {
            System.out.println("Motors: OFF");
            System.out.println("Robot is stopped");
        }
    }
}
