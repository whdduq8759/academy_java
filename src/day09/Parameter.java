package day09;

public class Parameter {
    // 랜덤으로 음식명 하나를 리턴한느 메소드
    static String choiceRandomFood() {
        String[] foods = {"짬뽕", "볶음밥", "치킨", "삼겹살", "파스타"};
        return foods[(int) (Math.random() * foods.length)];
    }

    // 전달받은 2개의 정수의 합을 구해서 리턴하는 메서드
    static int addTwo(int n1, int n2) {
        return n1 + n2;
    }

    // 전달받은 n개의 정수의 합을 구해 리턴하는 메서드
    static int calcNumbersTotal(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // int[] 대신 int...으로 변환하여 인수값을 배열형태 말고 숫자 형식으로 받을 수 있음

    static int calcNumbersTotal2(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        String result = choiceRandomFood();
        System.out.println(result);

        int sum = addTwo(5, 7);
        System.out.println(sum);


        int[] nums = {10, 20, 30};

        int total = calcNumbersTotal(nums);
        System.out.println(total);

        int total2 = calcNumbersTotal(new int[]{50, 100, 200, 300});

        System.out.println(total2);

        int total3 = calcNumbersTotal2(10, 20, 30, 40);
        System.out.println(total3);


    }
}
