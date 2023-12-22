package C15AnonymousLambda;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12,20};
//        //전통적인 방식의 데이터 접근방식, 원본데이터를 씀
//        for (int i = 0; i < arr.length; i++) {
//            //System.out.println(arr[i]);
//        }
//        //데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        //java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
//        //foreach : 스트림의 각 요소를 소모하면서 동작을 수행 , iterator와 같음. stream 객체에서 소모
////        Arrays.stream(arr).forEach(System.out::println);
////        Arrays.stream(arr).sorted().forEach(System.out::println);
//        //IntStream
//        int sum = Arrays.stream(arr).sum();
//
//        //스트림의 생성
//        String[] strArr = {"HTML","CSS","java","python"};
//        //제네릭타입으로 생성이 되는 경우
//        Stream<String> str1 = Arrays.stream(strArr);
//        //IntStream
//        int[] intArr = {10,20,30,40,50};
//        IntStream intStream = Arrays.stream(intArr);
//        int[] intArr2 = intStream.filter(a->a>20).toArray();
//        System.out.println(Arrays.toString(intArr2));
//        //스트링 참조변수 변환의 경우 제네릭의 타입소거 문제 발생
//        //자바 버전의 호환ㄴ성을 위해 제네릭 타입을런타임시점에 제거하는 것ㅇ르 의
//        String[] stArr3 = str1.filter(a->a.length()<=4).toArray(a->new String[a]);
//        //method 참조방식
//        String[] stArr2 = str1.filter(a->a.length()<4).toArray(String[]::new);
//
//        //중개연산, filter, map, sorted,distinct
//        int[] intArr = {10,10,30,30,50,50};
//        int sum = Arrays.stream(intArr).distinct().sum();
//        String[] strArr = {"HTML","CSS","java","python","python"};
//        String[] distinctArr = Arrays.stream(strArr).distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(distinctArr));
//
//        //distinct
//        String[] strArr3 = {"java","java","python","C++"};
//        //중복제거하고 길이가 3개 이하인것으로 제한하ㅏ고, 남은 배열의 길이 총합.
//        //mapToint를 통해 IntStream
//        //Stream<Integer> integerStream = Arrays.stream(strArr3).distinct().filter(a->a.length()<=3).map(a->a.length());
//        int intStream= Arrays.stream(strArr3).distinct().filter(a->a.length()<=3).mapToInt(String::length).sum();
//        System.out.println(intStream);
//
//        //sorted 정렬된 스트림반환
//        List<Integer> list = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
//
//        List<Integer> sortedlist =list.stream().sorted((o1,o2)->o2-o1).collect(Collectors.toList());
//        List<Integer> sortedlist2 =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        System.out.println(sortedlist);
//        System.out.println(sortedlist2);
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java","java","python","C++"));
//        List<String> stList1 = stList.stream().filter(a->a.length()>=4).sorted((o1,o2)->o2.length()-o1.length()).collect(Collectors.toList());
//        System.out.println(stList1);
//
//        int[] arr_plus10 = {4,6,1,2,3,5};
//        int[] new_arr = Arrays.stream(arr_plus10).map(a->a+10).toArray();
//        System.out.println(Arrays.toString(new_arr));
//        //arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라
//        int sum = Arrays.stream(arr_plus10).filter(a->a%2==0).map(a->a*a).sum();
//        System.out.println(sum);
//
//        //foreach
//        int[] arr = {10,20,30,40};
//        Arrays.stream(arr).forEach(System.out::println);
//
//        //reduce
//        int[] arr = {10,20,30,40};
//        //초기값을 지정하지 않으면 Optional 객체 return
//        //Optional 객체 : 값이 있을 수도 있고, 없을 수도 있다는 것을 명시한 타입 Java8 이상
//        int result = Arrays.stream(arr).reduce((a,b)->a*b).orElse(0);
//        //초기값
//        int result1 = Arrays.stream(arr).reduce(1,(a,b)->a*b);
//        System.out.println(result);
//        System.out.println(result1);
//        String myOptional =Optional.ofNullable("hello").orElseGet(()->"없음");
//        int[] arr2 = {10,20,30,40};
//        int result2 = Arrays.stream(arr2).reduce(0,(a,b)->a+b);
//        System.out.println(result2);
//        String [] strArr = {"hello", "java", "world"};
//        String answer = Arrays.stream(strArr).reduce((a,b)->a+","+b).orElseGet(()->"");
//        System.out.println(answer);
//        Optional<String> str = Arrays.stream(strArr).reduce((a, b) -> a + "," + b);
//
//        //최소/최대/평균/총합/갯수 : min/max/average/sum/cout
//        List<Integer> mylist = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int min = mylist.stream().min((a,b) ->a-b).orElse(0);
//        int max = mylist.stream().max((a,b) ->a-b).orElse(0);
//        int sum = mylist.stream().mapToInt(a-> a).sum();
//        long count = mylist.stream().mapToLong(a->a).count();
//        double average= mylist.stream().mapToDouble(a-> a).average().orElse(0);
//        System.out.println("min "+min+", max "+max+", sum "+sum+", count "+count+" average "+average);

        //findFirst, findAnny
        List<Student> students = new ArrayList<>();
        for(int i= 5; i <50; i+=5) {
            students.add(new Student("test"+i,i));
        }

//        Student a1 = students.stream().filter(a->a.getAge()>30).findFirst().orElse(new Student("no",0));
//        System.out.println(a1);
//        //가장나이어린사람
//        Student a2 = students.stream().min((a,b)->a.getAge()-b.getAge()).orElse(new Student("no",0));
//        //30대가 몇명인지
//        long a3 = students.stream()
//                .filter(a->a.getAge()>=30&&a.getAge()<40)
//                .count();
//        //모든 객체의 평균나이 출력
//        double a4 = students.stream().mapToDouble(a->a.getAge()).average().orElse(0);
//        //30세 이하 선착순 누구인지 출력
//        Student a5 = students.stream().filter(a->a.getAge()<=30).findFirst().orElse(new Student("no",0));
//        System.out.println("가장 나이 어린 "+a2.getAge());
//        System.out.println("30대가 몇 명인지 "+a3);
//        System.out.println("모든 객체의 평균나이 "+a4);
//        System.out.println("30세 이하 선착순 "+a5.getName());
//
//        //optional 객체
//        //optional 객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
//        Optional<String> opt1 = Optional.empty();
//        //빈값인지 아니지 check하는 isPresent()
//        //id로 조회시
//        if(opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("abc"));
//        } else {
//            System.out.println("값이 없습니다");
//        }
//        //optional객체 생성
//        //파라미터 등 받아서 처리할 때 사용할 수 있다
//        Optional<String> opt2 = Optional.ofNullable("hello");
//        //orElse() 관련 null(빈값)처리, orElseGet(), orElseThrow()
//        //orElse : 값이 있으면 해당값 return
//        System.out.println(opt2.orElse("").compareTo("abc"));
//        //orElseGet() : 값이 있으면 해당값 return, 없으면 람다함수 또는 메소드 참조
//        System.out.println(opt1.orElseGet(String::new).compareTo("abc"));
//        //orElseThrow() : 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생
//        //opt1 빈값
//        System.out.println(opt1.orElseThrow(()->new NoSuchElementException("객체에 값이 없습니다")).compareTo("abc"));
//
//        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
//        System.out.println(oi.orElseThrow(()-> new NoSuchElementException("no value")));

        //stream 디버깅이 어렵다.
        //stream peek 공부하기
    }
}

