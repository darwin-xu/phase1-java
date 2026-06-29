public class EqualsDemo {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 5;
        // System.out.println("a == b: " + (a == b)); // true

        // double x = 5.0;
        // System.out.println("a == x: " + (a == x)); // true

        // boolean a = true;
        // boolean b = false;
        // System.out.println("a == b: " + (a == b)); // false

        String str1 = "Hello"; // new string(""), #1
        String str2 = "Hello"; // #1
        System.out.println("str1 == str2: " + (str1 == str2)); // true <- not always // cache
        // 

        String stra = new String("Hello"); //#2
        String strb = new String("Hello"); //#3
        System.out.println("stra == strb: " + (stra == strb));

        System.out.println(str1.equals(str2));
        System.out.println(stra.equals(strb));
        System.out.println(str1.equals(strb));
    }    
}
