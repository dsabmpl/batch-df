// class - keyword , used to define a class
// class - blue print/ plan / template
// classname - PascalCase (Standard)
// AmitSrivastava
// class name and file name should be same
// class scope 
// a) public b) default
class Second {
    /*
     * main - Entry point of every java program
     * main is a function
     * void - keyword - nothing to return
     * static - when class is loaded static things will be loaded along.
     * public - things will be access inside and outside the package (folder)
     * String args[] - Command Line Arguments
     * // String - predefine class - collection of chars
     * // args - parameter name
     * // []= array ... var args
     */
    static public void main(String... a) {
        /*
         * println() - function to print
         * // println = print + new line
         * out = object , decide where to output
         * out is an object of PrintStream class
         * System - it is a predefine class contains the object
         * of out , in , err.
         */
        System.out.println("Hello Java");
    }
}