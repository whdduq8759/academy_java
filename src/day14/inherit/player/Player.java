package day14.inherit.player;

import day03.StdOutput;

// 공통 기능과 속성을 가진 클래스를 부모, 상위클래스라고 부름.
public class Player extends Object {
    //// 공통 필드
    public String nickName;
    public int level;
    public int hp;

    //// 공통 생성자
    public Player() {
        System.out.println("부모 객체 Player 생성!");
    }


    //// 공통 메소드
    public void info() {
        System.out.println("\n ================ 캐릭터 정보 ===================");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }


}
