package day09;
/* 
    1. 자바의 메서드는 클래스 내부, 메서드 외부에 선언합니다.
    2. 메서드는 메서드 안에서만 호출할 수 있다.

 */

public class MethodBasic {
    // 메서드 생성가능

    //1 ~ x까지의 총합을 구해서 리턴하는 함수 정의
    static int calcTotal(int x) {
        System.out.println("calcTotal이 호출됨!");
        int total = 0;
        for (int i = 0; i <= x; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {

        //메서드 호출
        int sum = calcTotal(100);
        System.out.println(sum);


    }
    //메서드 생성 가능
}
