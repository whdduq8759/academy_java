package day10;

// 설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    // 필드
    String model; // 모델명
    String color; // 색상
    int price; // 가격
    String[] receiveMessages; // 받은 문자메세지들
    int messageCount; // 총 문자메세지 수
    boolean isOn; // 전원 켜진 여부

    //생성자
    //객체를 생성하고 초기화를 담당

    Phone() {
        model = "갤럭시s21";
        color = "빨강";
        price = 100000000;
    }


    Phone(String model, String color, int price) {
    this.model = model;
    this.color = color;
    this.price = price;
    isOn = true;

    }






    // 기능: 객체가 하는 행위
    //메소드 : static은 붙이지 마세요.

    // 전원 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println("모델의 전원을 켭니다.");
    }

    // 전원 끄는 기능
    void powerOff() {
        isOn = false;
        System.out.println("모델의 전원을 끕니다.");
    }
    // 핸드폰의 정보를 보여주는 기능
     void showSpec() {
        if(!isOn) {
            System.out.println("전원을 먼저켜세요!");
            return;
        }
            System.out.println("\n### 휴대폰 정보 ###");
            System.out.println("* 모델명: " + model);
            System.out.println("* 색상: " + color);
            System.out.println("* 가격: " + price);

    }

    
    
}
