public class LineNumberExample {
    public static void main(String[] args) {
        String name = null;
        System.out.println("Starting program");
        System.out.println(name.length()); // Intentional runtime error for stack trace reading
        System.out.println("Done");
    }
}
