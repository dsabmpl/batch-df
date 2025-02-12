public class RecDemo {
    // Instance Method
    void show() {
        System.out.println("Amit");
    }

    // Non Instance Method or Static Method
    static void disp() {
        int x = 10; // Local Var
        System.out.println("I am static method");
    }

    public static void main(String[] args) {
        // ClassName.methodName()
        // RecDemo.disp();
        // if in same class
        disp();
        // RecDemo obj = new RecDemo();
        // obj.show();
    }
}
