package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class C1602Calendar {
    public static void main(String[] args) {
        // 날짜 관련 클래스의 종류 : Calendar(java.util)
        // java.time 패키지 안에 있는 Local로 시작하는 클래스 <- 이걸 쓰세요
        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());

        System.out.println(time.get(Calendar.YEAR));
        System.out.println(time.get(Calendar.MONTH)+1);
        System.out.println(time.get(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.DAY_OF_WEEK));
        System.out.println(time.get(Calendar.HOUR_OF_DAY));
        System.out.println(time.get(Calendar.MINUTE));

        //java.time 패키지
        LocalTime present_time = LocalTime.now();
        System.out.println(present_time);

        LocalDate present_date = LocalDate.now();
        System.out.println(present_date);
    }
}
