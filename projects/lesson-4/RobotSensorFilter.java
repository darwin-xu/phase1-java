public class RobotSensorFilter {
    public static void main(String[] args) {
        for (int reading = -3; reading <= 12; reading++) {
            if (reading < 0) {
                System.out.println(reading + " invalid");
                continue;
            }
            if (reading > 10) {
                System.out.println(reading + " out of range");
                break;
            }
            System.out.println(reading + " valid");
        }
    }
}
