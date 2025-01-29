public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int copy = num;
        // Count the Digit
        while (num != 0) {
            num = num / 10; // make the number small
            count++;
        }
        num = copy;
        int pow = (int) Math.pow(10, count - 1);
        while (num != 0) {
            System.out.println(num / pow);
            num = num % pow; // make number small
            pow = pow / 10; // make power small
        }

    }
}
