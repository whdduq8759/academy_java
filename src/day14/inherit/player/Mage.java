package day14.inherit.player;

public class Mage extends Player {
    //// 필드
    int mana;


    //// 생성자
    public Mage(String nickName, int level, int hp, int mana) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }

    public Mage() {

    }

    //// 메소드
    public void meteor() {

    }

    @Override
    public void info() {
        System.out.println("\n ================ 마법사 정보 ===================");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
        System.out.println("#마나: " + mana);
    }
}


