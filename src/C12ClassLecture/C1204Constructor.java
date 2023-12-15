package C12ClassLecture;

import java.util.Date;

public class C1204Constructor {
    public static void main(String[] args) {

        Calender myCal = new Calender("2023", "12","31");
        System.out.println(myCal.toString());
    }
}
class Calender {
    private String year;
    private String month;
    private String day;

    Calender() {}

    Calender(String year, String month) {
        this.year = year;
        this.month = month;
    }
    //메서드 오버로딩, 파라미터가 다른 같은 이름의 메서드 많이 만들어서 오버로딩
    Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //this() 키워드를 통해 클래스의 매개변수에 맞는 생성자 호출 가능.
    Calender(String year){
        this(year, null,null);
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Calender{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}