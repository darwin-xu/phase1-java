public class LogicalAND {
    public static void main(String[] args) {
        int battery = 25;
        boolean motorsEnabled = true;
        
        if (battery >= 20 && motorsEnabled) {
            System.out.println("Robot can move");
        } else {
            System.out.println("Cannot move");
        }
    }
}
