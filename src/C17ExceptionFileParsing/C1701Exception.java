package C17ExceptionFileParsing;

import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) {
//        //ArithmeticException : 0으로 나눌때
//        System.out.println("나눗셈 프로그램입니다. 숫자 10에 나눌 분모값을 입력해주세요.");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        //예외가 발생할 것으로 예상되는 코드에 try catch 감싸준다.
//        try {
//            System.out.println("10에 "+input+"을 나누면 "+num/input+"입니다");
//        } catch (ArithmeticException e){
//            System.out.println("0을 입력했습니다.");
//            System.out.println("C1701Exception 클래스에서 "+e.getMessage()+" 이유로 에러가 발생했습니다.");
//        } catch (IllegalArgumentException e) {
//            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
//            e.printStackTrace();
//        } catch(Exception e) {
//            System.out.println("알 수 없는 예외가 발생했습니다. ");
//        } finally {
//            System.out.println("시스템 종료");
//        }
//
//        System.out.println("감사합니다.");

        //throw와 throws 예제
        //checked exception
        //unchecked exception

        //trow와 throws 예제
        String password = "1234";

        try {
            login(password);
        } catch (IllegalArgumentException e) {
            //e.getMessage() throw new한 곳에서 넘어온 메시지
            System.out.println(e.getMessage());
        }


        //unchecked exception에서 throws를 하지 않더라도 예외는 호출한 곳으로 전파
        //이때에 throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일뿐
        //checkd exception은 예외처리가 강제되고, 해당메서드에서 예외처리를 하든지 throws 통해 호출한 곳에 위임
        // 이때에 호출한 쪽에서는 예외처리가 강제된다.
        //service throw new -- 비지니스 로직 체크하세요
        //controller try catch -- 예외처리 하세요

    }
    static void login(String password) throws IllegalArgumentException{
        if(password.length() < 10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
    }
}


