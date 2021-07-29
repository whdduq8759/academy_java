package day03;
import java.util.Scanner;
public class ScannerQuiz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("-상품의 가격: ");
        int productPrice = sc.nextInt();

        System.out.print("-상품의 개수: ");
        int productNum = sc.nextInt();
        System.out.println("----------------------");
        int total = productPrice * productNum;
        System.out.println("상품 재고 총액: " + total + "원");

        sc.close();
    }
}
