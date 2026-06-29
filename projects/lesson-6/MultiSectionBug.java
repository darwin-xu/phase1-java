public class MultiSectionBug {
    
    static int readSensorValue() {
        return 42;  // Simulated sensor
    }
    
    static int calculateOutput(int input) {
        int processed = input * 2;  // Process
        return processed;
    }
    
    static void printResult(int value) {
        System.out.println("Result: " + value);
    }
    
    public static void main(String[] args) {
        System.out.println("Step 1: Read sensor");
        int sensor = readSensorValue();
        System.out.println("  Sensor value: " + sensor);
        
        System.out.println("Step 2: Calculate");
        int result = calculateOutput(sensor);
        System.out.println("  Calculated result: " + result);
        
        System.out.println("Step 3: Output");
        printResult(result);
    }
}
