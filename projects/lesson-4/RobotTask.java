public class RobotTask {
    public static void main(String[] args) {
        int taskCode = 2;
        
        if (taskCode == 1) {
            System.out.println("Task: Move forward");
        } else if (taskCode == 2) {
            System.out.println("Task: Turn left");
        } else if (taskCode == 3) {
            System.out.println("Task: Grab object");
        } else {
            System.out.println("Task: Unknown");
        }
    }
}
