public class Palindrome {
    // static int reverse(int num) {

    // }

    static boolean palindrome(int num) {
        // int rev = reverse(num);
        // return rev == num;
        return false;
    }

    static void palindrome(int num, int org, int result) {
        // base case
        if (num == 0) {
            System.out.println(org == result ? "Palindrome " : "Not Palindrome");
            return;

        }
        int digit = num % 10;
        result = result * 10 + digit;
        palindrome(num / 10, org, result);
    }

    public static void main(String[] args) {
        int num = 123;
        palindrome(num, num, 0);
    }
}
