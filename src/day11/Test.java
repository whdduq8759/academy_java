package day11;

// 다른 패키지에 있는 클래스를 불러올 때 패키지명을 생략할 수 있게 해줌

// 모든 패키지를 사용할 때 *을 사용하면 전체를 다 사용가능하다


import day11.fruit.*;

public class Test {

    public static void main(String[] args) {

        Banana ba = new Banana();
        Mango ma= new Mango();
        Apple apple1 = new Apple();
        day11.company.Apple apple2 = new day11.company.Apple();
        //올 ㅋ


    }
}
