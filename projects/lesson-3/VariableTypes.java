// Demo 1: VariableTypes.java
// Goal: Show the declaration and use of different primitive types.
public class VariableTypes {
    public static void main(String[] args) {
        // int for whole numbers
        int teamNumber = 9999;
        int motorCount = 4;

        // double for decimal numbers
        double batteryVoltage = 12.7;
        double robotWeight = 35.5; // in lbs

        // boolean for true/false states
        boolean isAutonomous = false;
        boolean isEnabled = true;

        // String for text
        String robotName = "Sir Lancelot";
        String teamMotto = "We may not win, but we'll have fun!";

        System.out.println("== Robot Initial Status ==");
        System.out.println("Robot Name: " + robotName);
        System.out.println("Team Number: " + teamNumber);
        System.out.println("Battery: " + batteryVoltage + "V");
        System.out.println("Is currently in autonomous? " + isAutonomous);
    }
}
