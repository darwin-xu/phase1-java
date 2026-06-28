public class IfElseOrderBug {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        }
    }
}
