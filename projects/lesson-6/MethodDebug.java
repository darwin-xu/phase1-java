public class MethodDebug {
    
    static int calculateBonus(int salary) {
        System.out.println("  [calculateBonus] Input: salary = " + salary);
        
        int bonus = salary / 10;
        
        System.out.println("  [calculateBonus] Calculated: bonus = " + bonus);
        System.out.println("  [calculateBonus] Returning: " + bonus);
        
        return bonus;
    }
    
    public static void main(String[] args) {
        System.out.println("Starting program");
        
        int salary = 50000;
        System.out.println("Main: salary = " + salary);
        
        int bonus = calculateBonus(salary);
        
        System.out.println("Main: bonus returned = " + bonus);
        System.out.println("Total: " + (salary + bonus));
    }
}
