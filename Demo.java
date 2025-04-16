// Must have OOPS
// _MS
// Maker , Checker
// LMS, IMS, SMS
// class name - Noun
// SRP - Single Respo Principle
// Encapsulation - Binding Data and Methods into a single unit and that unit is a class.
class Student {
    // instance members
    int id;
    String name;
    int marks[] = new int[3];
    String course;

    // default cons - no args cons
    // classname and cons name same
    // cons not return anything
    // cons usecase - to initalize the instance members
    // default cons is empty, it do nothing
    // developer will decide what to do by default cons
    Student() {
        course = "DSA";
    }

    // Param Cons
    Student(int id, String name, int marks[]) {
        this();
        // Instance Var = Local Var
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    void takeInput() {
        // this - keyword
        // this contains the reference of current calling object
        this.id = 1001;
        name = "Ram Kumar";
        marks = new int[] { 10, 20, 30 };
        course = "JS";
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public String toString() {
        return "Id " + id + "Name " + name + " Course  " + course;
    }
}

class Demo {
    public static void main(String[] args) {
        // Student - Custom Data Type
        Student ram; // declare variable , ram is a variable
        // ram = new Student(); // init (default) - default constructor call
        ram = new Student(1010, "Ram", new int[] { 10, 20, 30 });
        System.out.println(ram);
        // ram.takeInput(); // re-init
        // System.out.println(ram);
        // System.out.println(ram.toString()); // classname@hexahashcode
        int x; // DataType variablename
        x = 10;
    }
}