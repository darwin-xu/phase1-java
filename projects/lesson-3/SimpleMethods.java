// Demo 2: SimpleMethods.java
// Goal: Demonstrate defining and calling methods, with and without parameters/return values.
public class SimpleMethods {

    // A simple method that takes no input and returns nothing (void).
    public static void printGreeting() {
        System.out.println("Hello from a method!");
    }

    // A method that takes a String parameter.
    public static void printPersonalGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to the team.");
    }

    // A method that takes two integers and returns their sum.
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        // Calling the simple void method
        printGreeting();

        System.out.println("--------------------");

        // Calling the method with a parameter
        printPersonalGreeting("Alex");
        printPersonalGreeting("Sarah");

        System.out.println("--------------------");

        // Calling the method with a return value
        int sum1 = add(10, 20);
        System.out.println("The sum of 10 and 20 is: " + sum1);

        int sum2 = add(100, 50);
        System.out.println("The sum of 100 and 50 is: " + sum2);

        // You can also use the result directly
        System.out.println("Directly printing the sum of 5 and 7: " + add(5, 7));
    }
}
