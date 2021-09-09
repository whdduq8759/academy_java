package day14.inherit.player;

// 상위클래스로부터 상속받은 클래스를 자식, 하위클래스
public class Warrior extends Player{
    //// 필드
    int rage;

    //// 생성자
    public Warrior() {
        super();
        System.out.println("전사 객체 생성!");
    }

    public Warrior(String nickName, int level, int hp, int rage) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.rage = rage;
    }

    //// 메소드
    public void fireSlash() {

    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }
}
