package day16.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("===========================================");
        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("============================================");
        Parent c = new Child();
        System.out.println(c);
        c.m1();
        c.m2();
        // 강제 타입 변환 (자기만의 메소드를 사용하고 싶으면 사용)
        ((Child)c).m3();


    }
}
