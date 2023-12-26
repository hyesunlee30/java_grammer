package C16EtcClass;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C1602Calendar {
    public static void main(String[] args) {
//        // 날짜 관련 클래스의 종류 : Calendar(java.util)
//        // java.time 패키지 안에 있는 Local로 시작하는 클래스 <- 이걸 쓰세요
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH)+1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH));
//        System.out.println(time.get(Calendar.DAY_OF_WEEK));
//        System.out.println(time.get(Calendar.HOUR_OF_DAY));
//        System.out.println(time.get(Calendar.MINUTE));
//
//        //java.time 패키지
//        LocalTime present_time = LocalTime.now();
//        System.out.println(present_time);
//
//        LocalDate present_date = LocalDate.now();
//        System.out.println(present_date);

        //임의로 특정시간을 만들어 내고 싶을때 : of 메소드 사용
        LocalDate birthDay = LocalDate.of(1980, 02, 19);
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());
        LocalTime birthTime = LocalTime.of(02,02,19);

        LocalDateTime bitrhDayTime = LocalDateTime.of(birthDay,birthTime);
        System.out.println(bitrhDayTime.get(ChronoField.YEAR));
        System.out.println(bitrhDayTime.get(ChronoField.MONTH_OF_YEAR));
        //오전 0, 오후 1
        System.out.println(bitrhDayTime.get(ChronoField.AMPM_OF_DAY));

        //지금 현재 시간은 오전입니다.
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYY-mm-dd HH:mm:ss");
        String date = now.format(dtf);
        if(now.get(ChronoField.AMPM_OF_DAY) == 1) {
            System.out.println("현재시간 "+ date +" 은 오후입니다.");
        } else {
            System.out.println("현재시간 "+ date+" 은 오전입니다.");
        }

    }
}
