package day16.poly.car;

public class Driver {

    public void test(int a) {
        System.out.println("a = " + a);

    }

    // drive(new Sonata()); => Car c = new Sonata();
    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }


}
