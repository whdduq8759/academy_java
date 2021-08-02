package day05;

public class forQuiz {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*8) +2;
        int num2 = 0;

        System.out.println("랜덤 구구단 " + num1 + "단");
        System.out.println("----------------------");
        for (int i = 1; i <10; i++) {
            num2 = i;
            System.out.println(num1 + " x " +num2 + " = " + num1*num2 );
        }
    }
}
