public class DebuggerDemo {
    public static void main(String[] args) {
        double forwardInput = 0.65;
        double turnInput = -0.20;
        double leftPower = forwardInput + turnInput;
        double rightPower = forwardInput - turnInput;
        System.out.printf("Left=%.2f, Right=%.2f%n", leftPower, rightPower);
    }
}
