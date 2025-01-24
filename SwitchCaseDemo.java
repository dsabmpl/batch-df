public class SwitchCaseDemo {
    public static void main(String[] args) {
        /*
         * switch case - menu driven and equality comparsion and default fall
         * to stop fall use break
         */
        final int TEA = 1;
        final int SOFT_DRINK = 2;
        System.out.println("1. Tea");
        System.out.println("2. Soft Drink");
        System.out.println("3. Burger");
        System.out.println("4. Pizza");
        int choice = 2;
        // switch case - byte , int , char
        switch (choice) {
            case TEA:
                System.out.println("Rs 50");
                break;
            case SOFT_DRINK:
                System.out.println("Rs 70");
                break;
            case 3:
                System.out.println("Rs 150");
                break;
            case 4:
                System.out.println("Rs 300");
                break;
            default:
                System.out.println("Wrong Choice....");
        }
        // Java 7 - switch with string
        String x = "tea"; // user input
        switch (x) {
            case "tea":
                System.out.println("Rs 50");
            case "drinks":
                System.out.println("Rs 70");

        }

    }
}
