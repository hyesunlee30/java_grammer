package Java;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

        // print 출력 후 줄 바꿈 없음
//        int a = 20;
//        System.out.print(a);
//
//        // 출력 후 줄 바꿈 있음 println
//        String myString = "hello world";
//        System.out.println(myString);
//        // 문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(myString+a);
//        // System.in(키보드 입력) + Scanner(입력을 위한 클래스)
//        //숫자와 숫자를 더하면 더하기 연산이 된다.
//        System.out.println(10 + 20);

        //---------------------------

        Scanner myScan = new Scanner(System.in);
//        System.out.println("문자열을 입력해주세요.");
//        // nextline은 입력 받은 데이터를 한 줄 읽어서 string으로 리턴
//        String inputs = myScan.nextLine();
//        System.out.println("사용자가 입력한 문자열 : "+inputs);

//        Scanner myScan1 = new Scanner(System.in);
//        System.out.println("정수를 입력해주세요.");
//        // nextline은 입력 받은 데이터를 한 줄 읽어서 string으로 리턴
//        int inputsInt = myScan1.nextInt();
//        System.out.println("사용자가 입력한 문자열 : "+inputsInt);

//        System.out.println("첫번째 숫자를 입력하세요.");
//        int a = myScan.nextInt();
//        System.out.println("두번째 숫자를 입력하세요.");
//        int b = myScan.nextInt();
//        System.out.println("두 수의 합은 "+(a+b)+" 입니다.");

//        //nextDouble
        System.out.println("소수점 입력해주세요");
        double d = myScan.nextDouble();
        System.out.println("소수점 입니다. "+d);
        System.out.println("ture/false 중 하나를 입력해주세요.");
        boolean isB = myScan.nextBoolean();
        System.out.println(isB+" 입니다");

        //입출력 시스템 메모리 해제
        myScan.close();


    }
}
