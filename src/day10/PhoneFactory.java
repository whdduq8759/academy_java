package day10;

// 실행용 클래스(객체를 생성해서 사용하는 곳)에 main을 만듭니다.
public class PhoneFactory {
    public static void main(String[] args) {
        // 객체의 생성
        Phone galaxyS21 = new Phone();
        galaxyS21.powerOn();



        Phone iPhoneX = new Phone();
        iPhoneX.powerOn();

        System.out.println("================================");
        iPhoneX.battery = new Battery("샤오미");
        System.out.println(iPhoneX.battery.company);

        System.out.println("============================");


        galaxyS21.sendMessage(iPhoneX, "앙");
        galaxyS21.sendMessage(iPhoneX, "앙");

        iPhoneX.checkMessages();

        iPhoneX.sendMessage(galaxyS21, "ㅗ");
        galaxyS21.checkMessages();
        // 객체의 속성과 기능 참조: 참조연산자 . 을 사용






    }
}
