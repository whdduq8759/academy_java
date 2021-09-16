package day19.inter;

public class Dog extends Animal implements Pet, Violent {

    @Override
    public void eat() {
        Pet.super.eat();
    }

    @Override
    public void play() {
        System.out.println("강아지는 뛰면서 놈");
    }


    @Override
    public void attack() {

    }
}
