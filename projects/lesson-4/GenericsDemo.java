import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        // ArrayList example with type safety
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names: " + names);
        
        // Iterate over the list
        System.out.println("\nIterating:");
        for (String name : names) {
            System.out.println("  - " + name);
        }
        
        // Generic Pair example
        Pair<String, Integer> score = new Pair<>("Alice", 95);
        System.out.println("\nScore: " + score);
        
        Pair<String, Double> measurement = new Pair<>("height", 1.75);
        System.out.println("Measurement: " + measurement);
        
        Pair<Integer, Integer> coordinate = new Pair<>(10, 20);
        System.out.println("Coordinate: " + coordinate);
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
