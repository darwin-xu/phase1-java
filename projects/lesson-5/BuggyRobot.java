public class BuggyRobot {
    public static void main(String[] args) {
        String sensorName = null;

        // Intentional bug for debugging workflow practice
        int nameLength = sensorName.length();
        System.out.println("Name length: " + nameLength);
    }
}
