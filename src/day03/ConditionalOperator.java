package day03;


import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {

        // 컨트롤 알트 v 하면 자동으로 변수 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("얼마 있음?");
        int money = sc.nextInt();
        sc.close();
        String food = money >= 5000 ? "김치찌개"
                    : money >= 2500 ? "라면" : "굶어!";
        System.out.println("음식 = " + food);



    }
}
