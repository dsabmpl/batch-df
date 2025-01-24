public class SwitchWithExpression {
    public static void main(String[] args) {
        // int a= 10 + 20
        // User Input for 1. Tea 2. Coffee 3. Drink
        int ch = 1;
        // Colon : vs Arrow ->
        // Java 14
        String result = switch (ch) {
            case 1 -> "Rs 50";
            case 2 -> "Rs 70";
            case 3 -> {
                int c = 100;
                int d = c * c;
                yield "Rs 150";
            }
            default -> "Wrong Choice";
        };

        // this would be switch case result
        System.out.println(result);
    }
}
