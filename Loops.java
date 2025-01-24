public class Loops {
    public static void main(String[] args) {
        // for , while , do while
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // while (true) {

        // }
        int j = 1;
        while (j <= 10) {
            if (j % 2 == 0) {
                j++;
            } else {
                j += 2;
            }
        }
        int k = 1;
        do {
            System.out.println("One time goes...");
        } while (k <= 0);
    }
}
