package day01;

public class variable {
    public static void main(String[] args) {

        // 변수 선언
        int number;

        //변수 초기화
        number = 100;
        System.out.println(number);

        //선언타입이 다른 값은 저장 불가
        int point = 78;
        //point = 78.99;

        int copyNum = number + 3;
        //soutv
        System.out.println("copyNum = " + copyNum);

        //문자열 저장시에는 String타입 사용
        //문자열값에는 반드시 겹따옴표만 사용
        String nickName = "보로로";

        //자바 변수 스코프(유효 범위) : 블록 스코프
        //변수는 자기가 선언된 블록을 벗어나면 메모리에서 제거됨
        int n1 = 10, n2 = 20;
        
        // 아 배 ㅈㄴ아프네
        // 아 배고프다
        if (true) {
            int n3 = n1 + n2;
            System.out.println("n3 = " + n3);
        }//end if
            int n3 = 100;
        System.out.println("n3 = " + n3);
        


    }//end main
}//end class
















