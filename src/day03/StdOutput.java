package day03;

public class StdOutput {
    public static void main(String[] args) {
        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.println(dog);
        System.out.println(cat);

        String filePath = "D:\\temp\\new.jpg";
        System.out.println(filePath);

        String msg = "He said \"waring!\" to me";
        System.out.println(msg);
        
        int month = 7;
        int day = 17;
        String anni = "제헌절";

        System.out.println(month + "월" + day + "일은 " + anni + "입니다");
        System.out.printf("%d월 %d일은 %s입니다. \n", month, day, anni);
        System.out.println("안녕");

        // %f는 무조건 소수점 6자리까지 표현합니다.
        // %.자리수f로 설정하면 자리수 만큼 나오게 된다.
        double saleRate = 0.2512;
        System.out.printf("오늘의 할인율은 %.2f%%입니다. \n", saleRate*100);

    }
}
