package day19.inter;

public class BullDog extends Dog implements Pet, Huntable{
    @Override
    public void hunt(String target) {
        System.out.println("불독은 근육으로 사냥함");
    }
}
