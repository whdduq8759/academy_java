package day19.inter;

// 인터페이스 끼리 상속이 가능함!
public interface Huntable extends WildAnimal {

    void hunt(String target); // 사냥기능
}
