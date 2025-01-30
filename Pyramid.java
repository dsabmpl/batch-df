public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // for (int row = 1; row <= n; row++) {
        // for (int space = 1; space <= n - row; space++) {
        // System.out.print(" ");
        // }
        // int odd = 2 * row - 1;
        // // int odd = 2 * row + 1;
        // for (int col = 1; col <= odd; col++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int val = 1;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // System.out.print(val);
            String str = String.valueOf(val);
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            val = val * 11;
            System.out.println();

        }
    }
}
