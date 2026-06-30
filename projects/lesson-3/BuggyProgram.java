// Demo 6: BuggyProgram.java
// Goal: A program with common bugs (NPE and Array Index Out of Bounds) for students to fix.
// This is intended as a homework exercise.
public class BuggyProgram {

    // This method is supposed to print a welcome message, but the name might be null.
    public static void printWelcomeMessage(String userName) {
        // BUG #1: This line will cause a NullPointerException if userName is null.
        // HINT: How can you check if a variable is null before using it?
        System.out.println("Welcome, " + userName.toUpperCase() + "!");
    }

    public static void main(String[] args) {
        // --- Part 1: The NullPointerException ---
        System.out.println("--- Testing Welcome Message ---");
        String user1 = "Alice";
        printWelcomeMessage(user1); // This one works fine.

        String user2 = null; // This represents a user who hasn't logged in.
        // The following line will crash the program. Students should fix printWelcomeMessage.
        printWelcomeMessage(user2);


        System.out.println("\n--- Testing Sensor Data ---");
        // --- Part 2: The ArrayIndexOutOfBoundsException ---
        int[] sensorReadings = {10, 20, 30, 40, 50};

        // This loop is supposed to print all readings.
        // BUG #2: The loop condition is incorrect and will try to access an index that doesn't exist.
        // HINT: If an array has 5 elements, what is the last valid index?
        for (int i = 0; i <= sensorReadings.length; i++) {
            System.out.println("Reading: " + sensorReadings[i]);
        }

        System.out.println("\n--- Part 3: The Logical Operator Bug ---");
        int robotScore = 150;
        int timeRemaining = 0; // seconds
        // BUG #3: This should be true if the score is high OR time is up, but it's not working.
        // HINT: What is the difference between AND (&&) and OR (||)?
        boolean isGameEndCondition = (robotScore > 100) && (timeRemaining == 0);
        System.out.println("Is the game over? " + isGameEndCondition);


        System.out.println("Program finished."); // This line will not be reached until bugs are fixed.
    }
}
