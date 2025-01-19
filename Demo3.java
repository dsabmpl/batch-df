import java.math.BigDecimal;
import java.math.BigInteger;
// import java.lang.*;
import java.util.LinkedList;

public strictfp class Demo3 {
    public static strictfp void main(String[] args) {
        char gg = 'A';
        // String - collection of chars, char [] - wrapper
        String name = "Amit";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        // World
        BigInteger b1 = new BigInteger("64564564564564564564353453453453453454353");
        BigInteger b2 = new BigInteger("43245346457567865867586786786787687686");
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        // Java InBuild DS
        LinkedList<Integer> l = new LinkedList<>();
        BigDecimal b4 = new BigDecimal("534543534534.22");
        // Wrapper Types
        int f = 10;
        Integer f2 = 1000;
        System.out.println(f2.byteValue());
        Float gg1 = 90.20F;
        Double gg2 = 90.9999;
        Character c1 = 'A';
        Boolean bo2 = true;
        boolean att = true;
        char accept = 'A';
        accept = 'न';
        System.out.println(accept);
        // strictfp - IEEE - 754 Floating Point Standard
        long timeInMs = 64656565656L; // long literal
        long t = 5453454353l;
        byte w = 100;
        byte w2 = 2;
        w2 += w;
        float p = 90.20f; // float literal
        float p2 = 90.20F;
        float p3 = (float) 90.20;

        double p4 = 90.34567;
        // byte w3 = (byte )(w + w2);
        // System.out.println(w3);
        // age
        byte age = 20; // byte literal
        byte r = (byte) 130;
        System.out.println(r);
        int x = 10;
        x = x + 10;
        System.out.println(x + 10); // 20
        System.out.println(x); // 10
    }
}
