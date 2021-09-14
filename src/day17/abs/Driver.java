package day17.abs;

public class Driver {

    Car mycar;

    public Driver(Car mycar) {
        this.mycar = mycar;
    }

    public void drive() {
        mycar.start();
        mycar.seatHeater();
    }
}
