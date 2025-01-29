public class SumOfDigit {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num != 0) {
            // Step - 1 get the digit from the number
            int lastDigit = num % 10;
            // Step - 2 Sum the Digit
            sum = sum + lastDigit;
            // Step -3 Make the digit small
            num = num / 10;
        }
        System.out.println(sum);
    }
}
