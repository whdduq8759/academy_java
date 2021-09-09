package day14.inherit.player;

public class Hunter extends Player{
    //// 생성자
    int mana;
    String beast;

    //// 생성자
    public Hunter(String nickName, int level, int hp, int mana, String beast) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
        this.beast = beast;
    }

    //// 메소드
    public void thunderShot() {

    }

    //// 공통 메소드
    @Override
    public void info() {
        System.out.println("\n ================ 헌터 정보 ===================");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
        System.out.println("# 동물:" + beast);
    }

}
