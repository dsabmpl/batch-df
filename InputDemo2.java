import java.util.Scanner;

public class InputDemo2 {
    public static void main(String[] args) {
        int x;
        String y = new String("Hello");
        Scanner scanner = new Scanner(System.in);
        // Scanner - Buffer
        // System.in - input
        System.out.println("Enter the First Number");
        int n = scanner.nextInt(); // nextXXX
        System.out.println("Enter the Second Number");
        int n2 = scanner.nextInt();
        System.out.println("Result " + n + " " + n2);

        scanner.close();

    }
}
