public class TripleLevelIf {
    public static void main(String[] args) {
        int battery = 25;
        int targetDistance = 50;
        boolean motorTest = true;
        
        if (battery > 20) {
            System.out.println("Battery OK");
            
            if (targetDistance > 0) {
                System.out.println("Target distance valid");
                
                if (motorTest) {
                    System.out.println("Motors passed test");
                    System.out.println("Robot ready to go!");
                }
            }
        }
    }
}
