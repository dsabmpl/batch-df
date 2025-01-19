public class StringDemo4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        // String literal object 1 or 0.
        String a = "Amit";
        String b = "Amit";
        String d = b;
        d = "Shyam";
        String c = new String("Amit");
        System.out.println(a == b);
        System.out.println(a == c);
        String d = new String("Ram");
        // b = "Shyam";
    }
}
