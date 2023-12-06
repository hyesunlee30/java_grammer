import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
//
//        //제어문 - if문, if/else문
//        //스캐너를 써서 사용자의 input int로 받아서
//        // 만약에 비밀번호와 사용자의 input 일치하면 문이열렷씁니다
//        // 일치하지 않으면 비밀번호가 틀렸습니다.
//
//        System.out.println("출입을 위한 비밀번호를 입력하세요.");
        Scanner myScan = new Scanner(System.in);

//        int password = 1234;
//        int inputPass = myScan.nextInt();
//
//
//        if (password == inputPass) {
//            System.out.println("문이 열렸습니다");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//        String password = "0234";
//        String input = myScan.nextLine();
//
//        if (password.equals(input)) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비민번호가 틀렸습니다.");
//        }

        //묵시적 타입변환 조건문일 경우 ascii 코드로 묵시적으로 변환됨.
        // a : 97
        // A: 65
        // B: 66

        // 사용자가 알파벳을 아무거나 입력받고 그 알파벳이 대문자인지 소문자인지 판별

        System.out.println("대문자, 소문자로 비교할 알파벳을 입력하세요.");
        char input = myScan.nextLine().charAt(0);

        if (input < 97) {
            System.out.println("대문자");
        } else {
            System.out.println("소문자");
        }


    }
}
