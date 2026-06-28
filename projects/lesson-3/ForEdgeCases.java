public class ForEdgeCases {
    public static void main(String[] args) {

        int[] values = { 10, 20, 30 };

        for (int i = 0; i < values.length + 1; i++) {
            System.out.println("[" + i + "] - " + values[i]);
        }
    }
}
