// Demo 4: ReferenceExample.java
// Goal: Demonstrate the difference between primitive and reference types.
public class ReferenceExample {

    // A simple class to represent a Robot
    static class Robot {
        String name;
    }

    public static void main(String[] args) {
        // --- Primitive Example ---
        System.out.println("--- Primitives ---");
        int a = 10;
        int b = a; // b gets a COPY of the value of a

        System.out.println("Before change: a = " + a + ", b = " + b);
        b = 20; // We change b
        System.out.println("After change:  a = " + a + ", b = " + b);
        System.out.println("Changing 'b' did NOT affect 'a'.\n");


        // --- Reference Example ---
        System.out.println("--- References ---");
        Robot robot1 = new Robot(); // robot1 holds an address to a new Robot object
        robot1.name = "Alpha";

        // robot2 gets a COPY of the ADDRESS in robot1
        Robot robot2 = robot1;

        System.out.println("Before change: robot1.name = " + robot1.name + ", robot2.name = " + robot2.name);

        // We change the name using the robot2 reference
        robot2.name = "Beta";

        System.out.println("After change:  robot1.name = " + robot1.name + ", robot2.name = " + robot2.name);
        System.out.println("Changing the object via 'robot2' DID affect 'robot1' because they point to the SAME object!");
    }
}
