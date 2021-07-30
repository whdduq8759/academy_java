package day04;

import java.util.Scanner;

public class whileQuiz {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        System.out.print("정수 1: " + num1);
//        int num2 = sc.nextInt();
//        System.out.println("정수 2: " + num2);
//
//        int total = 0;
//
//
//        while(num1<=num2) {
//            total += num1;
//            num1++;
//        }
//
//
//        System.out.println(num1 + "~" + num2 + "까지의 총합: " + total);
//        System.out.printf("%d~%d까지의 총합: %d\n",num1,num2, total);

        int total = 0;
        for(int i = 0; i <= 10; i++){
            total += i;
        }
        System.out.println(total);
    }
}
