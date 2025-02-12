public class PrintNumber {

    static void show(int num) {
        // Base case or Termination Case
        if (num == 0) {
            return; // exit from the current function call
        }
        // Pre Logic
        System.out.println(num);
        // Small Problem
        show(num - 1);
        // Post Logic
        // System.out.println(num);
    }

    public static void main(String[] args) {
        show(5);
    }
}
