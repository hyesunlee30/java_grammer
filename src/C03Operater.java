public class C03Operater {
    public static void main(String[] args) {
//        //연산자
//        //자바에서는 여러 종류의 연산을 수행하기 위한 다양한 연산자를 제공
//
//        //산술 연산자
//        int num1 = 8;
//        int num2 = 3;
//
//        System.out.println("num1+num2 "+(num1+num2));
//        System.out.println("num1-num2 "+(num1-num2));
//        System.out.println("num1*num2 "+(num1*num2));
//        System.out.println("num1/num2 "+(num1/(double)num2));
//        System.out.println("num1%num2 "+(num1%num2));
//
//        int a = 10;
//        a += 20; // 같은 의미 a = a + 20;
//        a -= 20; // 같은 의미 a = a - 20;
//
//        //대입연산자
//        int n1 = 7, n2= 7, n3 = 7;
//        n1 = n1 -3;  // 4
//        n2 -=  3; // 4
//        n3 =- 3;  // -3
//
//        int n4 = 10; int n5 = 10;
//        n4 /= 3;
//        n5 %= 3;
//        System.out.println(n4+" "+n5);
//
//        //증감연산자
//        //전위 증감 연산자
//        // 현재 라인의 명령문이 실행되기 전에 값이 증감
//        // ++a
//        // --a
//        //후위 증감 연산자
//        // 현재 라인의 명령문이 끝나고 나서 증감.
//        // a++
//        // a--
//
//        int a = 5;
//        int b = a++; // 현재 라인의 명령문이 끝나고 나서 증감.
//        System.out.println(a);//6
//        System.out.println(b);//5
//
//        a=5;
//        b=++a; // 현재 라인의 명령문이 끝나기 전에 증감.
//        System.out.println(a); //6
//        System.out.println(b); //6
//
//        int [] arr = {10,20,30};
//        a=0;
//        while (true) {
//            a++; // 증가시키고 검색
//            System.out.println(arr[a]);
//            a++;// 검색하고 증가
//        }
//
//        // 비교연산자
//
//        char ch1 = 'a';
//        char ch2 = 'A';
//
//        System.out.println(ch1 == ch2); // 같다
//        System.out.println(ch1 != ch2); // 같지 않다.
//
//        // 논리연산자 참, 거짓 &&, ||, !
//        int num1 = 10; int num2 = 20;
//        boolean result1, result2;
//
//        result1 = (num1 > 5) && (num1 < 20); // 둘 다 만족해서 true
//        result2 = (num2 < 10) || (num2 < 30); //둘 중에 하나만이라도 만족해서 true
//
//        System.out.println(result1); // ture
//        System.out.println(result2); // ture
//        System.out.println(!result2); // ture의 반대 false
//
//        // 비트연산자
//        // 비트단위로 논리 연산을 할 때 사용하는 연산자
//        // & 대응되는 비트가 모두 1이면 1을 반환함
//
//        System.out.println(2 & 1);
//        int n1 = 10; int n2 = 20;
//
//        if(n1>20 && n2>30) {
//            System.out.println("참입니다");
//        }
//
//        // | or 연산 비트가 1라도 1이면 1 반환
//        //0000101 = 5
//        //0000110 = 6
//        int m1 = 5; int m2 = 6;
//        System.out.println(m1 & m2); //4 0000100
//        System.out.println(m1 | m2); //7 0000111
//
//        // ^ 대응 되는 비트가 서로 다르면 1을 반환함. 비트 xor 연산
//        System.out.println(m1 ^ m2); //3 0000011
//        // ~ : not 연산, 각 자리마다 반대의 숫자 변환
//        System.out.println(~ m1); // 첫째자리가 음/양인데 음으로 변환.
//
//        //시프트 연산자 : << >> => 곱셈과 나눗셈 2의 제곱
//        System.out.println(m1 << 1); // 0000101 = 2^2 ,2^0 -> 2^3, 2^1
//        
//        //비트연산자의 활용
//        //XOR과 AND를 조합해 덧셈 뺄쌤으로 활용
//        //시프트 연산자를 활용해 곱셈, 나눗셈으로 활용
//        //이런식으로 컴퓨터 연산에서 비트연산자가 활용되는 것정도만 숙지
//
//
//        int a = 13; //00001101
//        int b = 9;  //00001001
//
//        while (b !=0 ) {
//            int sameIndex = a & b; // and 연산으로 구한 carry 두 개가 같은 값이 있는 걸 찾음
//            a = a ^ b; // xor 연산으로 구한 비트값 a에 할당
//            b = sameIndex << 1; // 두개가 같은 값을 연산하면 자릿수가 올라가기 때문에 일부러 shift해서 옆 자리로 옮김
//        }
//        System.out.println("13 + 9= "+a);
//        //same Index 두 개가 값이 같으면 한 칸씩 올려야 하니까 저장
//        //첫번째 반복
//        //sameIndex : 1001
//        //a : 00100 // XOR 자릿수가 일치하지 않은 값은 그냥 더하면 됩니다.
//        //b : 10010 // 한 자릿수 땡긴값
//        //a : 10110 // 더하기의 결과

    }
}
