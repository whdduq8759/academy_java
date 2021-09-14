package day16.poly.car;

public class Car {

    Tire frontLeft;
    NexenTire frontRight;
    KunhoTire rearLeft;
    KunhoTire rearRight;

    // 타이어 교체 기능
    public void changeTire() {
        this.frontLeft = new NexenTire();
        this.frontRight = new NexenTire();
        this.rearLeft = new KunhoTire();
        this.rearRight = new KunhoTire();
        System.out.println("타이어 교체완료!");

    }

    // 주행 기능
    public void run() {
        System.out.println("자동차가 달립니다.");
    }


}
