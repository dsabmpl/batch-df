import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Prime number");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime Number");
            return;

        }
        int factor = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factor++;
            }
        }
        System.out.println(factor == 0 ? "Prime Number" : "Not Prime Number");
    }
}
