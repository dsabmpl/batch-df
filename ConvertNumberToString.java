public class ConvertNumberToString {
    static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static void convert(int num) {
        if (num == 0) {
            return;
        }
        convert(num / 10); // Head Recursion
        // stack fall
        int digit = num % 10;
        System.out.print(arr[digit] + " ");
    }

    public static void main(String[] args) {
        int num = 12345;
        // o/p one two three
        convert(num);
        System.out.println();

    }
}
