package day08;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("문자: ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("입력종료!");
        sc.close();
    }
}
