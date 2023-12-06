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
//
//        //묵시적 타입변환 조건문일 경우 ascii 코드로 묵시적으로 변환됨.
//        // a : 97
//        // A: 65
//        // B: 66
//
//        // 사용자가 알파벳을 아무거나 입력받고 그 알파벳이 대문자인지 소문자인지 판별
//
//        System.out.println("대문자, 소문자로 비교할 알파벳을 입력하세요.");
//        char input = myScan.nextLine().charAt(0);
//
//        if (input >= 'a' && input <= 'z') {
//            System.out.println("소문자");
//        } else if (input >= 'A' && input <= 'Z') {
//            System.out.println("대문자");
//        }
//
//        // 버스카드 예제
//        // 내 돈이 얼마 있는지를 입력
//        // 버스요금 1500 이다.
//        // 더 적으면 탑승 불가
//        // 많으면 정상처리
//        // 도난여부 boolean
//
//        System.out.println("버스카드를 찍어주세요");
//
//        Scanner mySc = new Scanner(System.in);
//
//        boolean isStolenCard = true;
//        int cardBalance = mySc.nextInt();
//        int busfare = 1500;
//
//        if (cardBalance >= busfare && !isStolenCard) { // 탑승 가능 조건
//            System.out.println("정상처리 되었습니다.");
//        } else {
//            System.out.println("탑승이 불가합니다.");
//        }
//
//        if (cardBalance < busfare || isStolenCard) { // 탑승 불가 조건
//            System.out.println("탑승이 불가합니다.");
//        } else {
//            System.out.println("정상처리 되었습니다.");
//        }

        // 삼항 연산자
        String answer = "0234";
        System.out.println("비밀번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.equals(answer) ? "참":"거짓";
        System.out.println(result);
    }
}
