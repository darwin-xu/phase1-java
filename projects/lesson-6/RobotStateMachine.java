import java.util.Scanner;

public class RobotStateMachine {
    
    enum State { IDLE, MOVING, AIMING, SHOOTING }
    
    State currentState = State.IDLE;
    int targetX = 100;
    int currentX = 0;
    
    public void update() {
        log("Current state: " + currentState + ", position: " + currentX);
        
        if (currentState == State.IDLE) {
            if (targetX > currentX) {
                log("  Transitioning to MOVING");
                currentState = State.MOVING;
            }
        }
        else if (currentState == State.MOVING) {
            currentX = currentX + 10;  // Move forward
            log("  Moving... position now: " + currentX);
            
            if (currentX >= targetX) {
                log("  Reached target, transitioning to AIMING");
                currentState = State.AIMING;
            }
        }
        else if (currentState == State.AIMING) {
            log("  Aiming at target");
            log("  Transitioning to SHOOTING");
            currentState = State.SHOOTING;
        }
        else if (currentState == State.SHOOTING) {
            log("  Shooting!");
            log("  Transitioning to IDLE");
            currentState = State.IDLE;
        }
    }
    
    void log(String msg) {
        System.out.println("[" + Thread.currentTimeMillis() % 10000 + "] " + msg);
    }
    
    public static void main(String[] args) {
        RobotStateMachine robot = new RobotStateMachine();
        
        for (int i = 0; i < 10; i++) {
            robot.update();
        }
    }
}
