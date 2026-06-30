public class Motor {
    int speed;
    boolean enabled;

    public Motor() {
        speed = 0;
        enabled = true;
        System.out.println("Motor created, speed = " + speed);
    }

    public void setSpeed(int requestedSpeed) {
        System.out.println("Motor setSpeed called with: " + requestedSpeed);

        if (!enabled) {
            System.out.println("Motor disabled, ignoring command");
            return;
        }

        int clampedSpeed = Math.max(0, Math.min(100, requestedSpeed));
        speed = clampedSpeed;
        System.out.println("Motor speed now: " + speed);
    }
}
