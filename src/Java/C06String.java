package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

//        // 기본 자료형 int -> Integer
//        // 원시 자료형 변수는 new 키워드 없이 literal로만 세팅
//        // 참조형 변수는 new 키워드를 사용하여 값 세팅
//        // String, 배열 두 참조형 wrapper 클래스도 리터럴로 쓸 수 있게 허용해줬다.
//        // int arr = {0,1,2}
//        //  == 원시 자료형만 된다. 그래서 참조형은 equals 로 비교해야한다.
//        // a == b stack 메모리에 있는 것
//        // a.equals(b) 객체주소를 비교함으로서 동일한 객체인지 비교
//
//        // char -> Character
//
//        // 참조자료형 : 기본자료형을 제외한 모든 자료형
//        // Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//        // int와 Integer 간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        //오토언박싱
//        int c = b;
//        //언박싱 Integer -> int 형변환
//        int d = b.intValue();
//        //오토박싱
//        Integer e = a;
//        //박싱
//        Integer f = Integer.valueOf(a);
//
//        //String과 int의 형변환
//        int a = 10; // 숫자
//        String st_a = Integer.toString(a); // 글자 "10"이 됨.
//
//        //참조 자료형에 원시자료형을 담을 때는 wrapper 클래스를 써야한다.
//        //컬렉션 프레임워크(ArrayList, HashSet, HashMap) List<int> list = new ArrayList<>(); 은 안된다.
//        List<Integer> list = new ArrayList<>();
//        list.add(10); // Integer로 담겼다가 int로 저장했다가 꺼낼때는 Integr로 꺼내진다.
//        list.add(20);
//        list.add(30);
//
//        System.out.println(list); // arraylist 는 toString heap 메모리에서 찾아와서 잘 출력한다.
//
//        //객체 사용방식과 리터럴 방식의 메모리저장 차이
//        //객체사용방식은 힙메모리에 데이터 저장
//        // 리터럴 방식의 경우 문자열 heap메모리에 - 상수풀이라는 특별한 공간에 저장
//        // 리터럴 방식을 사용하는 최적화에 도움
//        // 같은 문자열이 중복될 수 있으니 같은 풀에 넣어두고 사용
//        // == 주소 비교, String은 같은 주소를 공유하기 때문에 String s1 = cat, String s2 = cat
//        // s1 = s2
//        // String s3 = new String("cat");
//        // s1 == s3 // false
//
//        //String 풀과 String 객체는 같은 곳에 있지 않다.
//        String mySt1 = new String("hello"); // 메모리의 heap
//        String mySt2 = new String("hello");
//        String mySt3 = "hello"; // heap의 상수풀
//        String mySt4 = "hello";
//        String mySt5 = mySt1; // 주소값을 저장하기때문에
//        System.out.println(mySt1 == mySt2); // false 다른 곳에 위치 heap에 주소만
//        System.out.println(mySt1 == mySt3); // false 다른 곳에 위치 heap에 주소만
//        System.out.println(mySt3 == mySt4); // true String 상수풀
//        System.out.println(mySt1 == mySt5); // true String 주소값을 저장하기때문에 같다, 주소값 비교
//
//        System.out.println(mySt1.equals(mySt2)); // true
//        System.out.println(mySt1.equals(mySt3)); // true
//        System.out.println(mySt3.equals(mySt4)); // true
//        System.out.println(mySt1.equals(mySt5)); // true
//
//        List<String> myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("hello2");
//
//        List<String> myList2 = myList;
//        myList2.add("hello myList2");
//        myList2.add("hello myList1");
//        System.out.println(myList2);
//
//        String mySt = "hello";
//        System.out.println(mySt.length()); // 길이 int 반환
//        String mySt2 = "hello java";
//        System.out.println(mySt2.indexOf("java")); // 특정 문자열의 위치가 시작하는 위치 반환; 없을 경우 -1 반환
//        //contains 문자열에서 특정 문자열이 포함되어 있는지 확인
//        System.out.println(mySt2.contains("ja")); // boolean
//
//        String a = "hello";
//        //charAt 문자열에서 특정 위치(index)의 문자(char)를 리턴
//        char myChar = a.charAt(1);
//        System.out.println(myChar);
//
//        int cnt = 0;
//        String a = "abcdefabaadf";
//        //charAt length 를 활용한 a 문자의 개수 ?
//        for (int i =0; i < a.length(); i++) {
//            char b = a.charAt(i);
//            if (b == 'a') {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//        //subString 문자열 자르기 a이상 b미만.
//        String a = "안녕하세요. 저는 한국인입니다.";
//        String b = a.substring(0,6);
//        String c = a.substring(7,a.length());
//        System.out.println(b);
//        System.out.println(c);
//
//        //trim , strip
//        String trimSt = "   hello  ";
//        String t = trimSt.trim();
//        String s = trimSt.strip();
//        System.out.println(trimSt);
//        System.out.println(t);
//        System.out.println(s);
//
//        //toUpperCase/toLowCase
//        //대소문자 변환 리턴
//
//        String a = "abCdEfgHijkLMnop";
//        String b = a.toLowerCase();
//        String c = a.toUpperCase();
//        System.out.println(b+" "+c);
//
//        //문자열 더하기
//        String a = "hello";
//        a += " world";
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("hello ").append("world");
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("hello").append(" world");
//        System.out.println(a);
//        System.out.println(stringBuilder.toString());
//        System.out.println(stringBuffer.toString());
//
//        String str = "01abc123한글123";
//        String str2 = "";
//        for (int i = 0; i<str.length(); i++) {
//            char a = str.charAt(i);
//            if(a < 'a' || a > 'z') {
//                str2+=Character.toString(a);
//            }
//        }
//        System.out.println(str2);
//
//        // replace(a,b) 문자열중에 특정 문자열을 바꿔 새로운 문자열을 return;
//        // replaceAll replace 와 동일한 기능, 다만 정규표현식을 활용할 수 있음
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        String st3 = st1.replaceAll("world", "python");
//        System.out.println(st2 +" "+st3);
//        String str = "01Abc123한글123#%";
//        //전체
//        String str_kr = str.replaceAll("[A-z]","");
//        System.out.println(str_kr);
//        //한글
//        String str2 = str.replaceAll("[가-힣]","");
//        System.out.println(str2);
//        //숫자
//        String str3 = str.replaceAll("[0-9]","");
//        System.out.println(str3);
//        //한글 + 숫자 + 알파벳
//        String str4 = str.replaceAll("[A-z0-9가-힣]", "");
//        System.out.println(str4);
//
//        //대표적인 메타문자
//        //^와$는 문자열의 시작과 끝을 명시적으로 알림
//        //^와$를 안쓰면 전체 문자에 대한 검사가 아닌 부분이 일치해도 통과 메타문자가 섞일 경우 시작과 끝을 구분짓는 용도
//        //[xy]는 x,y 문자중 하나, [x-y]는 x~z 사이의 문자중 하나
//
//        //Pattern 클래스
//        //알파벳 문자열 검사
//        boolean matcher = Pattern.matches("[A-z]+","helloworld");
//        System.out.println(matcher);
//
//        //전화번호 검증
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-123@-1234");
//        System.out.println(matcher2);
//
//        //이메일 검증
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.[a-z]+$","abc@naver.net");
//        System.out.println(matcher3);
//
//        //split 문자열을 특정 구문으로 분리하는 메소드
//        String a = "a:b:c:d";
//        String [] strArr = a.split(":");
//        System.out.println(Arrays.toString(strArr));
//        String b = "a b c d";
//        String [] strArr2 = b.split(" ");
//        System.out.println(Arrays.toString(strArr2));
//        String c = "a  b c d";
//        String [] strArr3 = c.split("\\s+"); // 여러개의 공백을 의미한다.
//        System.out.println(Arrays.toString(strArr3));
//        String d = " a  b c d";
//        String e = d.trim();
//        System.out.println(e);
//
//        String[] arr = new String[5]; // 객체 초기화 안 하면 string은 null이 들어감
//        arr[0] = "hello";
//        arr[1] = "world";
//        System.out.println(arr[2].isEmpty()); // NPE , isBlank는 "" 뿐만 아니라 " " 도 막을 수 있기 때문에 isBlank를 써야한다.
//
//        int a = 10;
//        String st_a = Integer.toString(a);//
//        String st_a2 = String.valueOf(a); //
//        int c = Integer.parseInt(st_a); // String -> int
//
//        //배열선언
//        String[] arr = {"java","c","python"};
//        String joinStr =String.join(" ",arr);
//        System.out.println(joinStr);

        //StringBuffer 문자열을 추가하거나 변경 할 때 주로 사용하는 객체 스레드 세이프 synchronized
        // 성능 : String < StringBuffer < StringBuilder(스레드 safe X)
        StringBuffer bufc = new StringBuffer("hello ");
        bufc.append("world");
        bufc.insert(6,"java ");
        System.out.println(bufc.toString());
        System.out.println(bufc.substring(6,10));
        System.out.println(bufc.delete(6,11));
//
//        System.out.println();
//        StringBuffer buf = new StringBuffer("한국");
//         buf.append(" 미국");
//         buf.append(" 일본");
//         String str = buf.toString();
//        System.out.println(str);
//        //append() 마지막에 추가대상 문자열을 추가
//        //insert(5, "hello");
//        //subString(0,5);
//        //delete(1,2);
//        StringBuilder sb = new StringBuilder("안녕");
//        sb.append("하세요.");
//        sb.append(" 이땡땡입니다.");
//        System.out.println(sb.toString());
//
//        String[] strArr = {"java","c","python"};
//
//        for (int i = 0; i < strArr.length; i++) {
//            sb.append(strArr[i]);
//            sb.append(" ");
//        }
//
//        System.out.println(sb.toString());
    }
}
