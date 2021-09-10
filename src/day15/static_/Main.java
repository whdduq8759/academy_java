package day15.static_;
public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.x = 5;
        c1.y = 10;

        Count c2 = new Count();
        c2.x++;
        c2.y++;

        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        Count c3 = new Count();
        Count.y += 40;
        System.out.println("Count.y = " + Count.y);
        //카운트 점 와이 카아우운트 저엄 와아이 카아우운트으 저어엄 와아아이이이


        c1.m1();
        c2.m1();

        Count.m2(c3);
        //엠투

        double result = Calculator.calc(5);
        System.out.println("result = " + result);
    }
}
