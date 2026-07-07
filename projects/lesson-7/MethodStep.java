public class MethodStep {

    static int clampMotorPower(int requestedPower) {
        if (requestedPower < 0) {
            return 0;
        }
        if (requestedPower > 100) {
            return 100;
        }
        return requestedPower;
    }

    public static void main(String[] args) {
        int result = clampMotorPower(135);
        System.out.println(result);
    }
}
