public class SwapDigitWithPos {
    public static void main(String[] args) {
        int num = 32145;
        int position = 0;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            position++;
            int val = position * (int) Math.pow(10, digit - 1);
            sum = sum + val;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
