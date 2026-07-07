public class MethodDebug {

    static int calculateSafeStoppingDistance(int speedCmPerSecond) {
        System.out.println("  [calculateSafeStoppingDistance] Input speed = " + speedCmPerSecond);

        int brakingDistance = speedCmPerSecond / 4;
        int reactionBuffer = 25;
        int stoppingDistance = brakingDistance + reactionBuffer;

        System.out.println("  [calculateSafeStoppingDistance] brakingDistance = " + brakingDistance);
        System.out.println("  [calculateSafeStoppingDistance] reactionBuffer = " + reactionBuffer);
        System.out.println("  [calculateSafeStoppingDistance] Returning = " + stoppingDistance);

        return stoppingDistance;
    }

    public static void main(String[] args) {
        System.out.println("Starting approach planner");

        int currentSpeed = 180;
        System.out.println("Main: currentSpeed = " + currentSpeed);

        int stoppingDistance = calculateSafeStoppingDistance(currentSpeed);

        System.out.println("Main: stoppingDistance = " + stoppingDistance + " cm");
        System.out.println("Slow down if obstacle is closer than " + stoppingDistance + " cm");
    }
}
