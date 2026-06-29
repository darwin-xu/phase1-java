public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 25;
        double salary = 50000;
        
        // Outer condition
        if (age >= 18) {
            System.out.println("You are an adult");
            
            // Inner condition (only checked if outer is true)
            if (salary >= 40000) {
                System.out.println("You have a good income");
            } else {
                System.out.println("You are still building your income");
            }
        } else {
            System.out.println("You are a minor");
        }
    }
}
