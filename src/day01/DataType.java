package day01;

public class DataType {
    public static void main(String[] args) {

        //정수형
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L;

        //실수형
        float f1 = 3.84848488448F;
        double f2 = 3.213131232132132;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        
        double n = 0.0;
        //fori
        for (int i = 0; i < 100 ; i++) {
            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과: " + n);


        //논리형
        boolean b1 = true;
        boolean b2 = false;
        //자바의 논리형은 js처럼 falsy값이 존재하지 않는다.

        
        //문자형
        //char : 단일문자를 저장, 홑따옴표 사용가리
        char c1 = 'a';

        //String : 문자열을 저장, 겹따옴표를 사용수철 (기본타입이 아님)
        String s1 = "park";

        //컨트롤 + d : 복사
        System.out.println("100" + "200");
        System.out.println(100 + "200");
//        System.out.println("200" - 100);





    }
}
