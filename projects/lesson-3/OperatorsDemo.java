// Demo for Lesson 2, Part 1
// Goal: Demonstrate various Java operators.
public class OperatorsDemo {
    public static void main(String[] args) {

        // --- 1. Arithmetic Operators ---
        System.out.println("--- Arithmetic Operators ---");
        int a = 100;
        int b = 25;
        System.out.println("a + b = " + (a + b)); // 125
        System.out.println("a - b = " + (a - b)); // 75
        System.out.println("a * b = " + (a * b)); // 2500
        System.out.println("a / b = " + (a / b)); // 4

        // Modulus (remainder) operator
        int c = 10;
        int d = 3;
        System.out.println("10 % 3 = " + (c % d)); // 1 (because 10 = 3*3 + 1)


        // --- 2. Assignment and Shorthand Operators ---
        System.out.println("\n--- Assignment Operators ---");
        int score = 0;
        System.out.println("Initial score: " + score);
        score += 10; // score = score + 10;
        System.out.println("After adding 10: " + score);
        score *= 2; // score = score * 2;
        System.out.println("After multiplying by 2: " + score);

        // Increment and Decrement
        int lives = 3;
        System.out.println("Initial lives: " + lives);
        lives--; // lives = lives - 1;
        System.out.println("After losing a life: " + lives);


        // --- 3. Comparison Operators ---
        System.out.println("\n--- Comparison Operators ---");
        int robotSpeed = 50;
        int maxSpeed = 75;
        System.out.println("Is robotSpeed equal to 50? " + (robotSpeed == 50));       // true
        System.out.println("Is robotSpeed not equal to 50? " + (robotSpeed != 50));     // false
        System.out.println("Is robotSpeed greater than maxSpeed? " + (robotSpeed > maxSpeed)); // false
        System.out.println("Is robotSpeed less than or equal to maxSpeed? " + (robotSpeed <= maxSpeed)); // true


        // --- 4. Logical Operators ---
        System.out.println("\n--- Logical Operators ---");
        boolean isAutonomous = true;
        int batteryLevel = 95;

        // AND (&&) operator
        boolean canStartMission = isAutonomous && (batteryLevel > 20);
        System.out.println("In autonomous AND battery > 20? " + canStartMission); // true

        // OR (||) operator
        boolean isWarning = (batteryLevel < 10) || (robotSpeed > 100);
        System.out.println("Battery low OR speed too high? " + isWarning); // false

        // NOT (!) operator
        boolean isManualMode = !isAutonomous;
        System.out.println("Is the robot in manual mode? " + isManualMode); // false
    }
}
