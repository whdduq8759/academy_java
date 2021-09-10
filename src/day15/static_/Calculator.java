package day15.static_;

public class Calculator {
    String madeBY;
    String color;
    static double pi;

    // 정적초기화자
    // static 필드이 생성자 역할(객체 초기화)
    static {
        System.out.println("정적 초기화자 호출");
        pi = 3.14159265;
    }

    // 메소드안에서 인스턴스필드를 사용해야 하면
    // non-static으로 만들고, static필드만 사용하면 static으로 만들면 됨.


    // 계산기에 색칠하는 기능
    void paint(String color) {
        this.color = color;

    }

    public Calculator(String madeBY, String color) {
        this.madeBY = madeBY;
        this.color = color;
    }

    //원의넓이를 구ㅏㅎ는 기능
    static double calc(int r) {
        return pi * r * r;
    }
}
