package day19.inter;

// 인터페이스는 필드와 일반메소드는 사용불가, 상수나 추상메소드로 이루어져 있음!
public interface Pet {

    //상수
    int AAA = 10;

    //추상메소드
    void play();

    default void eat() {

    };
}
