import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {

        // 기본 자료형(스텍),  참조 자료형 => new 해당클래스명(힙메모리) -> 객체
        // overflow, underflow
        //byte 127, -127
//        byte num1 = 127;
//        byte num2 = -128;
//        num1++;
//        System.out.println(num1);
//        num2--;
//        System.out.println(num2);


        //실수 flaot, double
        // 기본타입 double
        // overflow, underflow

//        float f1 = 1.123456789f;
//        double d1 = 1.123456789;
//
//        System.out.println("f1 "+f1);
//        System.out.println("d1 "+d1);
//
//        //부동소수점 오차 테스트
//        double double_num = 0.1;
//        //미세오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
//        //반복적인 연산시 오차가 확대되어 오차확인가능
//        for(int i = 0; i<100; i++) {
//            System.out.println(i);
//        }

        //0.1을 특정변수에 1000번을 더해서 더한값 출력
//        double d2 = 0;
//        for (int i = 0; i < 1000; i++) {
//            d2 = d2 + 0.1;
//        }
//        System.out.println(d2);
//
//        //오류 안 남
//        System.out.println(0.1+0.1);
//        //오류 남
//        System.out.println(0.1+0.2);
//        //오류 해결법
//        double total =0;
//        for(int i =0; i <1000; i++) {
//            total = total + 0.1 * 10;
//        }
//        System.out.println(total/10);
//
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//
//        //BigDecimal 참조형 변수 표현방법
//        //오차가 생길 수 있으니까 최대한 BidDecimal을 쓰자.
//        BigDecimal bd = new BigDecimal("1.03");
//        BigDecimal bd2 = new BigDecimal("0.42");
//
//        System.out.println(bd.subtract(bd2));
//
//        double db = bd.subtract(bd2).doubleValue();
//        System.out.println(db);
//
//        // 문자 : char 2바이트 utf8, ASCII 표준
//        char my_char = '가';
//        System.out.println(my_char);
//
//        //ture 1, false 0
//        boolean 선언만 하고 초기화 하지 않을 시에 기본값음 0 false 이다.
//        boolean isA = true;
//        if (isA) {
//            System.out.println("조건식은 참입니다");
//        }
//
//
//        int num1 = 20;
//        int num2 = 10;
//
//        if(num1 > num2) {
//            System.out.println(num2+"보다 "+num1+"이 더 큽니다.");
//        }
//
//        // 타입변환
//        // int -> long 괜찮음
//        // long -> int 안 괜찮음 짤림
//        // int -> double 괜찮음
//        // double -> int 안 괜찮음 짤림
//
//        // 묵시적(자동)타입변환
//        char ch1 = 'a';
//        int ch1Num = ch1; // 아스키코드에 있는 a를 담으려고 한다고 생각하고 타입 변경함.
//        System.out.println(ch1Num);
//
//        //알파벳 비교를 위한 묵시적 타입변환이 일어난다
//        System.out.println('A'>'a'); // ascii 코드로 비교
//
//
//        // 명시적 타입변환
//        int ch1Num2 = (int)ch1;
//        System.out.println(ch1Num2);
//       // 묵시적(자동)타입변환
//        int myInt = 10;
//        double myDouble = myInt;
//        System.out.println(myDouble);
//        //myInt = myDouble; 에러 발생
//        //  명시적 타입은 가능 : 소수점값 손실발생 가능성이 있다.
//        myInt = (int)myDouble;
//        double my_double2 = 7.2f;
//        System.out.println(my_double2);
//        //명시적 타입변환
//        char my_char2 = 'b';
//        int char_num = (int)my_char2;
//
//        // int a가 1 int b가 4일때 둘을 나눈 값을 int에 담아 출력 double에 담아 출력
//
//        int a = 1;
//        int b = 4;
//
//        int c = a / b; // int 때문에 소수점이 날아가겠구나
//        double d = a/b; // int / int 라서 결과가 int라서 문제가 생긴다. 명시적으로 double로 해야함
//        double e = (double)a/(double)b;
//
//        System.out.println("int c "+c);
//        System.out.println("int double d "+d);
//        System.out.println("double e "+e);
//
//        // 상수
//
//        // 변수와 상수
//        //선언과 동시에 초기화
//        int a1 = 10;
//        //변수값 변경
//        a1 = 20;
//        //선언만 한 뒤에 나중에 초기화
//        int a2; //지역변수는 선언만 됐을 때는 값이 0으로 초기화 되지 않으나, 객체로 선언될때는 0으로 초기화
//        a2 = 30;
        //클래스의 맴버변수 즉, static 변수와 객체변수일 경우 로 만들 때는 각 주소값이 0으로 초기화;
        //main - 지역변수일 경우 초기화 안됨.
        int [] arr = new int[5];
        System.out.println(arr[1]);
//        // 상수는 값의 재할당이 불가능
//        final int AGES = 20;
//        //AGES = 30; -- 에러가 발생한다
//        //상수는 선언만 한
        //int는 선언만 할 경우 0이 할당 - 메모리상, String은 선언만 할 경우 메모리상에 null이 할당된다.

        // 정수 byte, long, int
        // 실수 float, double









    }
}
