package day17.abs;

public abstract class Car {

    private String model;
    private int price;


    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // 주행 기능
    // 추상 메소드 : 다른 자식 클래스가 필수적으로 만들 수 있게 하는 기능 (안만들면 오류가 뜸!)
    // 추상 메소드를 쓰고 싶으면 클래스를 추상 클래스로 바꿔줘야함 !!
    public abstract void start();
//    public abstract  void enginBreak();

    public void seatHeater() {
        System.out.println("시트 열선 기능을 가동합니다.");
    }

    public final void powerHandle() {
        System.out.println("파워핸들 기능!");
    }
}

