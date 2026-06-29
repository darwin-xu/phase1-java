public class NullPointerDemo {
    public static void main(String[] args) {
        String message = null;  // message is null (nothing)
        
        try {
            System.out.println(message.length()); // Try to use it
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
