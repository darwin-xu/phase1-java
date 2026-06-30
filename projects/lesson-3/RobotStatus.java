// Demo 3: RobotStatus.java
// Goal: A complete program that uses variables and methods to simulate a robot's status.
public class RobotStatus {

    // Method to calculate battery percentage from voltage
    // This is a simplified model.
    public static int calculateBatteryPercentage(double voltage) {
        double maxVoltage = 13.0;
        double minVoltage = 10.5; // Robot shuts down below this

        if (voltage >= maxVoltage) {
            return 100;
        }
        if (voltage <= minVoltage) {
            return 0;
        }

        double percentage = ((voltage - minVoltage) / (maxVoltage - minVoltage)) * 100;
        return (int) percentage; // Cast to int to get a whole number
    }

    // Method to display the robot's status
    public static void displayStatus(String name, int battery, boolean isEnabled) {
        System.out.println("===== " + name + " STATUS =====");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Enabled: " + isEnabled);

        if (battery < 20) {
            System.out.println("WARNING: BATTERY IS LOW!");
        }
    }

    public static void main(String[] args) {
        String robotName = "Optimus Prime";
        double currentVoltage = 12.5;
        boolean robotIsEnabled = true;

        // Calculate the battery percentage by calling our method
        int batteryPercent = calculateBatteryPercentage(currentVoltage);

        // Display the initial status
        displayStatus(robotName, batteryPercent, robotIsEnabled);

        System.out.println("\n...simulating some activity...\n");

        // After some activity, the voltage drops
        currentVoltage = 11.2;
        batteryPercent = calculateBatteryPercentage(currentVoltage);
        displayStatus(robotName, batteryPercent, robotIsEnabled);
    }
}
