package day02;

public class Casting1 {
    public static void main(String[] args) {
        // 묵시적 형변환
        byte a = 100;
        int b = a; // a가 byte타입에서 int로 승격됨.
        System.out.println(b);

        double c = b; // b가 int타입에서 double로 승격됨.
        System.out.println(c);
        
        // 명시적 형변환
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);
        
        double d = 500.1234;
        int i = (int) d;
        System.out.println("i = " + i);
        
        
        char r = 'A';
        int o = r;
        System.out.println("o = " + o);
        short p = (byte)o;
        System.out.println("p = " + p);
    }
}
