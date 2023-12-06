import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//
//        // 제어문 while문 조건이 true 일때까지 반복됨.
//        // 무한루프로 빠질 수 있기 때문에
//        int a = 2;
//        while (a  <= 10) {
//            System.out.println(a);
//            a++;
//        }
//
//
//        //무한 반복 구구단
//        while(true) {
//            System.out.println("출력할 단수를 입력하세요.");
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            int j = 1;
//            while (j < 10) {
//                System.out.println(input+"*"+j+"="+input*j);
//                j++;
//            }
//        }
//
//        //비밀번호를 맞추면 반복이 종료되고, 그렇지 않으면 계속 진행됨
//        //최대 5번만 입력 가능
//        int cnt = 0;
//        while (true) {
//            System.out.println("비밀번호를 입력하세요");
//            Scanner myScan = new Scanner(System.in);
//            int password = 1234;
//            int inputPass = myScan.nextInt();
//            if (password == inputPass) {
//                System.out.println("문이 열렸습니다");
//                break;
//            } else {
//                cnt++;
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            if (cnt > 5) {
//                System.out.println("비밀번호 시도 횟수가 5회가 넘어서 더이상 시도할 수 없습니다.");
//                break;
//            }
//        }
//
//        // do while 문 무조건 한 번은 실행하기 위해,
//        int a = 0;
//        do {
//            a++;
//            System.out.println(a);
//        } while (a<10);
//
//        for (int i = 1; i <10; i++) {
//            for (int j2 = 1; j2<10; j2++) {
//                System.out.println(i+"*"+i+"="+i*j2);
//            }
//        }
//
//        for (int i = 2; i <= 10; i++) {
//            System.out.println(i);
//        }

        // continue 를 사용해서 홀수만 출력되도록 1~10까지 수 중에

        for (int i = 0; i<11; i++) {
            if (i%2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
