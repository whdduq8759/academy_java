package day02;

public class Casting2 {
    public static void main(String[] args) {
        // 낮은 것을 높은 것으로 변환하여 계산함
        char c = 'B';
        int i = 2;
        System.out.println(c + i);

        char result1= (char)(c + i);
        System.out.println("result1 = " + result1);


        double result2 = 3.5F + 5.6;
        //크키가 다른 데이터끼리의 연산은 크기가 작은쪽이 큰쪽으로 자동형변환 된 후 연산됨.

        //int보다 작은 값들(바이트,숏,차)의 연산은 결과값이 자동으로 int로 형 변환됨.
        byte b1 = 100, b2 = 110;
        int b3 = b1 + b2;

        int n1 = 27, n2 = 5;
        double n3 = (double)n1 / n2;
        System.out.println(n3);



    }
}
