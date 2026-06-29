public class ComparisonDemo {
    public static void main(String[] args) {
        int score = 85;
        int passingScore = 70;
        
        System.out.println("Score: " + score);
        System.out.println("Passing score: " + passingScore);
        System.out.println();
        
        // Greater than
        System.out.println(score + " > " + passingScore + " is " + (score > passingScore)); // true
        
        // Less than
        System.out.println(score + " < " + passingScore + " is " + (score < passingScore)); // false
        
        // Equal to
        System.out.println(score + " == " + 85 + " is " + (score == 85)); // true
        
        // Not equal to
        System.out.println(score + " != " + 70 + " is " + (score != passingScore)); // true
        
        // Greater than or equal
        System.out.println(score + " >= " + 85 + " is " + (score >= 85)); // true
        
        // Less than or equal
        System.out.println(score + " <= " + 80 + " is " + (score <= 80)); // false
    }
}
