package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("# 우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");

        System.out.println("-삭제할 학생의 별명을 입력하세요!");
        System.out.print("> ");
        String member = sc.next();


        int idx = -1;

        // 탐색
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(member)) {
                idx = i;
                break;
            }// end if
        }// end for

        if (idx != -1) {
            int delIdx = idx;
            for (int i = delIdx; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
                break;
            }// end for
        }// end if

        String[] temp = new String[arr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
        temp = null;

        System.out.println("삭제 후 정보: " + Arrays.toString(arr));

        sc.close();
    }//end main
}
