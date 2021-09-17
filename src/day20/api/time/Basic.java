package day20.api.time;

import java.time.*;

public class Basic {
    public static void main(String[] args) {

        //날짜 정보 얻기
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //특정 날짜정보를 생성
        LocalDate targetDate = LocalDate.of(2022, 5, 21);
        System.out.println(targetDate);

        //현재 시간정보 얻기
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        //현재 날짜와 시간을 얻기
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);

        int year = now2.getYear();
        System.out.println(year);

        Month month = now2.getMonth();
        System.out.println(month);

        DayOfWeek dayOfWeek = now2.getDayOfWeek();
        System.out.println(dayOfWeek);


    }
}
