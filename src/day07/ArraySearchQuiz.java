package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("# 변경 전 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");


        while (true) {
            System.out.print("- ");
            String member = sc.next();

            // 순차 탐색: 탐색성공시 해당데이터의 인덱스, 실패시 -1
            int idx = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(member)) {
                    idx = i;
                    break;
                }
            }// end for

            // 수정 여부 결정
            if (idx != -1) {
                System.out.println("-수정할 멤버의 이름을 입력하세요");
                System.out.print("> ");
                String changeMember = sc.next();
                arr[idx] = changeMember;
                System.out.println("변경완료");
                System.out.println("*변경 후 정보: " + Arrays.toString(arr));
                sc.close();
                break;

            } else {
                System.out.println(member + "은(는) 없는 이름입니다.");
            }
        }


    }// main end
}
