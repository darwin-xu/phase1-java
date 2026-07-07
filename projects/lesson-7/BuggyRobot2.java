public class BuggyRobot2 {
    public static void main(String[] args) {
        int totalSteps = 0;
        String[] commands = {"RIGHT", "UP", "LEFT", "DOWN "};

        for (String command : commands) {
            if (command.equals("RIGHT")) {
                totalSteps += 5;
            } else if (command.equals("UP")) {
                totalSteps += 5;
            } else if (command.equals("LEFT")) {
                totalSteps += 5;
            } else if (command.equals("DOWN")) {
                totalSteps += 5;
            }

            System.out.println("Processed command '" + command + "' => total: " + totalSteps);
        }

        System.out.println("\nExpected: 20, Actual: " + totalSteps);
    }
}
