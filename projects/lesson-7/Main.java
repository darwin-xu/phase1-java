public class Main {
    public static void main(String[] args) {
        System.out.println("Creating robot");
        Robot robot = new Robot();

        System.out.println("Approaching open hallway target");
        robot.approachTarget(140);

        System.out.println("Approaching wall");
        robot.approachTarget(45);
    }
}
