public class MultiBranch {
    // single branch
    static void singleBranch(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        singleBranch(num - 1); // single branch recursion
    }

    // multi branch
    static void multiBranch(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        // multi branch (recursive call n times)
        multiBranch(num - 1);
        multiBranch(num - 2);
    }

    public static void main(String[] args) {
        singleBranch(3);
        multiBranch(4);
    }
}
