public class GradeCalculator {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        
        double average = (double) sum / scores.length;
        
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
