public class SwitchEdgeCases {
    public static void main(String[] args) {
        int mode = 2;
        switch (mode) {
            case 1:
                System.out.println("IDLE");
                break;
            case 2:
            case 3:
                System.out.println("ACTIVE");
                break;
            default:
                System.out.println("UNKNOWN");
        }
    }
}
