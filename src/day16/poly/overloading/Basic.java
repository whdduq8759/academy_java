package day16.poly.overloading;

import day14.protected_.pac1.B;

public class Basic {
    // add(int, int)
    int add(int n1, int n2) {
        System.out.println("두개짜리 실행");
        return n1 + n2;
    }
    // add(int, int, int)
    int add(int n1, int n2, int n3) {
        System.out.println("세개짜리 실행");
        return n1 + n2 + n3;
    }
    // add(int, String)
    int add(int x, String y) {
        return 0;
    }

    // add(int, String)
    /*void add(int m, String n) {

    }*/
    // add(String, int)
    void add(String m, int n) {

    }

    void add() {

    }



    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.add(3, 5);

        System.out.println();

    }
}
