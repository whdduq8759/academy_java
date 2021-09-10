package day15.static_;

public class Count {

    public int x; //인스턴스 필드 인스턴트 음식
    public static int y; // 저엉적 필드 저어엉적 피일드 저어어어어엉저어억 피리이일드으~


    public void m1() {
        int z = this.x + this.y;

    }

    public static void m2(Count c) {
        // static메소드에서는 인스턴스 멤버를 직접 사용불가능 this라는 개념이 없다람쥐
//        int z = x + y;
        int z = c.x + y;
    }


}
