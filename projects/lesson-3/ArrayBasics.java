// Demo 5: ArrayBasics.java
// Goal: Show how to create, initialize, access, and loop through arrays.
public class ArrayBasics {
    public static void main(String[] args) {
        // --- Array of Primitives ---
        System.out.println("--- Array of integers (scores) ---");
        // Declare and initialize an array of integers
        int[] scores = {88, 92, 100, 76, 85};

        // Access elements by index (starts at 0)
        System.out.println("The first score is: " + scores[0]); // 88
        System.out.println("The third score is: " + scores[2]); // 100

        // Change a value in the array
        scores[3] = 80; // Change 76 to 80
        System.out.println("The fourth score is now: " + scores[3]);

        // Loop through the array to print all values
        System.out.println("\nAll scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score at index " + i + ": " + scores[i]);
        }

        // --- Array of Objects (Strings) ---
        System.out.println("\n--- Array of Strings (team members) ---");
        String[] teamMembers = new String[4]; // Create an empty array of size 4

        // Add elements to the array
        teamMembers[0] = "Alice";
        teamMembers[1] = "Bob";
        teamMembers[2] = "Charlie";
        teamMembers[3] = "David";

        System.out.println("All team members:");
        for (int i = 0; i < teamMembers.length; i++) {
            System.out.println("- " + teamMembers[i]);
        }
    }
}
