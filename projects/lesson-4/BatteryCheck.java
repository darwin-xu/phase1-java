public class BatteryCheck {
    public static void main(String[] args) {
        double battery = 15.0;
        
        if (battery >= 20) {
            System.out.println("Battery is good: " + battery + "%");
        } else {
            System.out.println("BATTERY LOW: " + battery + "%");
        }
    }
}
