package day10;

// 설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    // 필드

    // 고유데이터
    String model; // 모델명
    String color; // 색상
    int price; // 가격

    // 상태 데이터
    String[] receiveMessages = new String[3]; // 받은 문자메세지들
    int messageCount; // 총 문자메세지 수
    boolean isOn; // 전원 켜진 여부

    //부품 데이터: 집합관계
    Battery battery;


    //생성자
    //객체를 생성하고 초기화를 담당

    // Phone() -> 기본생성자
    Phone() {
        model = "갤럭시s21";
        color = "빨강";
        price = 100000000;
    }
    // 생성자는 여러 개 선언할 수 있음
    // 오버로딩 규칙: 매개변수의 타입이나 개수나 순서가 달라야함

    // Phone(String)
    Phone(String model) {
        this.model = model;
        isOn = true;

    }

    // Phone(String, String)
    Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Phone(String, String, int)
    Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
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
        if (!isOn) {
            System.out.println("전원을 먼저켜세요!");
            return;
        }
        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price);

    }

    //문자메세지를 보내는 기능
    boolean sendMessage(Phone targetPhone, String message) {
        if (!isOn) {
            System.out.printf("%s의 전원을 먼저 켜세요\n", model);
            return false;
        } else if (!targetPhone.isOn) {
            System.out.printf("상대방 %s의 전원이 꺼져있습니다\n", targetPhone);
            return false;
        }

        //메시지를 보낼 수 있는 경우
        if (targetPhone.messageCount < targetPhone.receiveMessages.length) {
            targetPhone.receiveMessages[targetPhone.messageCount++] = message;

            System.out.println("메세지가 성공적으로 전송됨.");
            return true;
        } else { //상대방 메세지함이 다 찬 경우
            System.out.println("상대방의 메세지함이 가득 찼습니다.");
            return false;
        }
    }

    // 수신 메세지함을 확인하는 기능
    void checkMessages() {
        System.out.printf("\n ======\\ [%s]의 메세지함 ====== \n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }

    // 배터리 교환기능
    void changeBattery() {
        battery = new Battery("삼성");
    }

}
