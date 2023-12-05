public class C04Operater {
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

        // 논리연산자 참, 거짓 &&, ||, !
        int num1 = 10; int num2 = 20;
        boolean result1, result2;

        result1 = num1 > 5 && num1 < 20; // 둘 다 만족해서 true
        result2 = num2 < 10 || num2 < 30; //둘 중에 하나만이라도 만족해서 true

        System.out.println(result1); // ture
        System.out.println(result2); // ture
        System.out.println(!result2); // ture의 반대 false





    }
}
