public class IfElseBoundary {
    public static void main(String[] args) {
        int battery = 20;
        if (battery > 20) {
            System.out.println("Battery OK");
        } else if (battery > 10) {
            System.out.println("Low battery");
        } else {
            System.out.println("Critical battery");
        }
    }
}
