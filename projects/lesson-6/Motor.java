public class Motor {
    int speed;
    
    public Motor() {
        speed = 0;
        System.out.println("Motor created, speed = " + speed);
    }
    
    public void setSpeed(int s) {
        System.out.println("Motor setSpeed called with: " + s);
        speed = s;
        System.out.println("Motor speed now: " + speed);
    }
}
