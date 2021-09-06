package day13.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
//        myCar.startInjectionGasoline();
//        myCar.moveCylinder();
        myCar.engineStart();

        myCar.accelerator();
        myCar.accelerator();
        myCar.accelerator();
        myCar.accelerator();


        myCar.slowdown();
        myCar.slowdown();
        myCar.slowdown();
        myCar.slowdown();
        System.out.println("현재 속도: " + myCar.getSpeed());

        System.out.println("-------------------------------------------------------");

        myCar.setMode('D');




    }
}
