package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        //문자열1.equals(문자열2) 을 사용!
        // ex) if(s1 == s2) x
        // ex) if(s1.equals(s2)) o
        Scanner sc = new Scanner(System.in);
        System.out.println("# 먹고 싶은 음식을 입력하세요.");
        System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요.");

        String[] foods = new String[0];

        while (true) {
            System.out.print("> ");
            String list = sc.nextLine();

            if (list.equals("그만")) {
                break;
            }//if end

            String[] temp = new String[foods.length + 1];

            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }

            //temp마지막 인덱스에 새로운 음식 추가
            temp[temp.length-1] = list;
            foods = temp;
            temp = null;

        } // while end
        System.out.println("입력종료!");
        System.out.println("먹고싶은 음식: " + Arrays.toString(foods));

        sc.close();
    }//main end
}
