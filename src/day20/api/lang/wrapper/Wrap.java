package day20.api.lang.wrapper;

public class Wrap {

    static int x;
    static Integer y;

    public static void main(String[] args) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 5;
        y = 7;
        System.out.println(x+y);

        int n = 100;
        Integer m = n;

        //문자열 변환기능 (올 ㄹㅇ ㅋㅋ)
        String s1 = "90";
        String s2 = "5.11";
        int i = Integer.parseInt(s1);
        double v = Double.parseDouble(s2);
        System.out.println(i + v);
    }
}
