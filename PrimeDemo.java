public class PrimeDemo {
    public static void main(String[] args) {
        // Approch -2
        int num = 17;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime ");
                return; // exit from the function
            }
        }
        System.out.println("Prime Number");

        /* Approach - 1 */
        /*
         * int num = 17;
         * int factorCount = 0;
         * for (int i = 1; i <= num; i++) {
         * if (num % i == 0) {
         * factorCount++;
         * }
         * }
         * if (factorCount == 2) {
         * System.out.println("Prime Number");
         * } else {
         * System.out.println("Not Prime Number");
         * }
         */
    }
}
