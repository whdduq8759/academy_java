package day09;

public class MethodQuiz1 {
    //메소드
    static int calcDivisor(int num) {
        int total = 0;
        System.out.println(num + "의 약수: ");
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.printf("%d", i);
                total += i;

            }

        }

        return total;

    }
    public static void main(String[] args) {


        System.out.println("10의 약수의 총합: " + calcDivisor(10));
        System.out.println("==========================");
        System.out.println("10의 약수의 총합: " + calcDivisor(30));
    }
}
