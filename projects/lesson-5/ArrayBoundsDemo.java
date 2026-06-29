public class ArrayBoundsDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};  // Array has 3 elements
        
        try {
            System.out.println(numbers[0]); // OK - first element
            System.out.println(numbers[3]); // ERROR - no 4th element!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
