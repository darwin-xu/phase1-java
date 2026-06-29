import java.util.ArrayList;
import java.util.List;

public class CollectionsPractice {
    public static void main(String[] args) {
        // Convert array to ArrayList
        String[] namesArray = {"Alice", "Bob", "Charlie"};
        List<String> names = new ArrayList<>();
        for (String n : namesArray) {
            names.add(n);
        }
        names.add("Dana");
        System.out.println("Names from array: " + names);
        
        // Working with Integer list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        // Compute sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nNumbers: " + numbers);
        System.out.println("Sum: " + sum);
        
        // Simple generic class usage
        Pair<String, Integer> p = new Pair<>("score", 100);
        System.out.println("\nPair example: " + p);
        
        // Different type combinations
        Pair<String, String> location = new Pair<>("city", "Seattle");
        Pair<Integer, Boolean> status = new Pair<>(42, true);
        System.out.println("Location: " + location);
        System.out.println("Status: " + status);
    }
}

class Pair<T, U> {
    public final T first;
    public final U second;
    
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
