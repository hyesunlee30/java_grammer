package C15AnonymousLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
        int[] arr = {20,10,4,12,20};
        //전통적인 방식의 데이터 접근방식, 원본데이터를 씀
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
        }
        //데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
        //java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
        //foreach : 스트림의 각 요소를 소모하면서 동작을 수행 , iterator와 같음. stream 객체에서 소모
//        Arrays.stream(arr).forEach(System.out::println);
//        Arrays.stream(arr).sorted().forEach(System.out::println);
        //IntStream
        int sum = Arrays.stream(arr).sum();

        //스트림의 생성
        String[] strArr = {"HTML","CSS","java","python"};
        //제네릭타입으로 생성이 되는 경우
        Stream<String> str1 = Arrays.stream(strArr);
        //IntStream
        int[] intArr = {10,20,30,40,50};
        IntStream intStream = Arrays.stream(intArr);
        int[] intArr2 = intStream.filter(a->a>20).toArray();
        System.out.println(Arrays.toString(intArr2));
        //스트링 참조변수 변환의 경우 제네릭의 타입소거 문제 발생
        //자바 버전의 호환ㄴ성을 위해 제네릭 타입을런타임시점에 제거하는 것ㅇ르 의
        String[] stArr2 = str1.filter(a->a.length()<4).toArray(String[]::new);
        System.out.println(Arrays.toString(stArr2));

    }
}

