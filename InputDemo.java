import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        int wordCount = 0;
        Scanner scanner = new Scanner("Hello How are You");
        while (scanner.hasNext()) {
            wordCount++;
            System.out.println(scanner.next());
        }
        System.out.println("Total Words are " + wordCount);
        scanner.close();
    }
}
