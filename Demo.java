public class Demo {
    // can we have more than one main in a single class
    // main overloading
    public static void main() {
        System.out.println("I am the main...");
    }

    public static void main(int x) {
        System.out.println("I am another main of int");
    }

    // ... var args
    static public void main(String... a) {
        main();
        main(10);
        System.out.println("Hello Java"); // print in new line
        System.out.print("hello"); // print in same line
    }
}
