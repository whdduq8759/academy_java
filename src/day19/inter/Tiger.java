package day19.inter;

public class Tiger extends Animal implements Huntable, Violent {

    @Override
    public void hunt(String target) {
        System.out.println("호랑이 앞발로 사냥함");
    }

    @Override
    public void attack() {

    }
}
