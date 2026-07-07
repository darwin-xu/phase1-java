public class Robot {
    Motor driveMotor;

    public Robot() {
        System.out.println("Creating robot...");
        driveMotor = new Motor();
    }

    public void approachTarget(int frontDistanceCm) {
        int requestedSpeed = chooseApproachSpeed(frontDistanceCm);

        System.out.println("Robot sees target at " + frontDistanceCm + " cm");
        System.out.println("Robot requesting speed " + requestedSpeed);

        driveMotor.setSpeed(requestedSpeed);
    }

    private int chooseApproachSpeed(int frontDistanceCm) {
        if (frontDistanceCm > 120) {
            return 70;
        }
        if (frontDistanceCm > 60) {
            return 35;
        }
        return 0;
    }
}
