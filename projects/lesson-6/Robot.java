public class Robot {
    Motor motor;
    
    public Robot() {
        System.out.println("Creating robot...");
        motor = new Motor();
    }
    
    public void move(int speed) {
        System.out.println("Robot moving at speed " + speed);
        motor.setSpeed(speed);
    }
}
