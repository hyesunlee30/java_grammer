import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        //자료형 list
//        // List<Integer> list -- 인터페이스
//        // new ArrayList><(); -- 구현체
//        //List<Integer> list = new ArrayList<>();
//        //list 선언방법
//        //ArrayList<String> myList = new ArrayList<String>();
//        //ArrayList<String> myList = new ArrayList<>();
//        // 가장 일반적인 방식
//        //List<String> myList = new ArrayList<>();
//        // 초기값 생성방법 1
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("c#");
//        myList.add("python");
//        System.out.println(myList);
//
//        //초기값 생성방법 2
//        List<String> myList2 = new ArrayList<>(Arrays.asList("java","python","c++"));
//        System.out.println(myList2);
//        String[] myArr = {"java","python","c++"};
//        List<String> myList3 = new ArrayList<>(Arrays.asList(myArr));
//        System.out.println(myList3);
//
//        //배열이 int인 경우 -> 형변환 문제발생
//        int[] myIntArr1 = {1,2,3};
//        //List<Integer> myIntList1 = new ArrayList<>(Arrays.asList(myIntArr1));
//
//        // 이렇게 하면 된다.
//        List<Integer> myIntList1 = new ArrayList<>();
//        for (int mia : myIntArr1) {
//            myIntList1.add(mia); //auto boxing
//        }
//        System.out.println(myIntList1);
//
//        //배열과 유사항 자료구조
//        //동이한 데이터 타입
//        //인덱스에 의한 접근
//
//        // 배열과의 차이
//        // 리스트의 사이즈는 동적으로 할당
//        // 데이터 중간 삽입가능한 구조로 인해 삽잆/삭제시 성능 저하
//        // 지속적인 배열사이즈 복사로 인한 삽입 성능저하
//        // 사이즈를 새롭게 한 칸만 할당하는게 비효율적임
//        // arrayList를 만들때 전체 배열 복사 할당으로 되기 때문이다
//
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        // 주요 메서드
//        // add (Type t)
//        list.add(10);
//        list.add(20);
//        //add (int index, Type t) - 중간에 값 삽입은 성능을 저하시킨다.
//        list.add(1, 25);
//        //System.out.println(list);
//        //addAll list를 list2 마지막에 붙여준다.
//        list.add(100);
//        list.add(200);
//        list2.addAll(list);
//        System.out.println(list2);
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        //get 특정 요소에 반환
//        System.out.println(myList.get(0));
//        for(int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        //size 리스트의 개수 반환
//        int a = myList.size();
//        System.out.println(a);
//        //remove
//        myList.remove(0);
//        System.out.println(myList);
//        //객체를 통한 삭제 : Integer.valueOf
//        myList.remove(Integer.valueOf(2));
//        //isEmpty()
//        //set
//        // size는 1부터 센 값이기 때문에 -1일 해줘야 마지막값에 들어간다.
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
//        //contains
//        boolean b = myList.contains(100);
//        System.out.println(b);
//        //맨첫번째값 index 리턴 indexOf 마지막값은 lastIndexOf
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        System.out.println(myList.indexOf(20));
//        //isEmpty
//        System.out.println(myList.isEmpty());
//
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(myList.isEmpty());
//
//        //indexOf 지정된 요소가 위치한 인덱스 중 첫번째 값을 반환
//        // 리스트가 해당요소를 포함하지 않으면 -1 반환
//
//
//        int[] m1 = new int[3];
//        m1[0] = 1;
//        m1[1] = 2;
//        m1[2] = 3;
//        // 리스트의 출력
//        List<int[]> myList = new ArrayList<>();
//
//        myList.add(m1);
//
//        List<int[]> list2 = new ArrayList<>();
//        list2.add(new int[]{1,2,3});
//        list2.add(new int[2]);
//        list2.add(new int[3]);
//        list2.get(1)[0] = 10;
//        list2.get(1)[1] = 20;
//
//        for (int i = 0; i<list2.size(); i++) {
//            int [] a = list2.get(i);
//            System.out.println(Arrays.toString(a));
//        }
//
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());

//        for (int i = 0; i < myList.size(); i++) {
//            myList.get(i).add(10);
//        }
//
//
//        //위 list에 값 1,2,3 10,20,30 100,200,300
//        List<int[]> list2 = new ArrayList<>();
//        list2.add(new int[3]);
//        list2.add(new int[3]);
//        list2.add(new int[3]);
//
//
//        int value = 1;
//        for (int i = 0; i < list2.size(); i++) {
//            for (int j = 0; j <list2.get(i).length; j++) {
//                list2.get(i)[j] = (j+1)*value;
//            }
//            value *= 10;
//        }
//
//        for (int i = 0; i<list2.size(); i++) {
//            int [] a = list2.get(i);
//            System.out.println(Arrays.toString(a));
//        }
//        // 컬렉션클랙스를 위용한 정렬
//        //collection은 List, Set, Queue 등의 상위 인터페이스
//        //Collections.sort(numbers);
//        //Collections.sort(numbers, Comparator.reverseOrder);
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
//        //리스트 정렬1 : Collections.sort();
//        Collections.sort(myList);
//        System.out.println(myList);
//
//        //리스트 정렬2 : 객체.sort();
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
//        //1.string 배열을 list로 변환
//        String[] strArr = {"hello","java","c#"};
//        List<String> mylist = new ArrayList<>(Arrays.asList(strArr)); // 객체 타입 아닐때 문제 생김
//
//        //2 for문
//        List<String> list2 = new ArrayList<>(); // 원시타입일때
//        for (String a: strArr) {
//            list2.add(a);
//        }
//
//        System.out.println(list2);
//
//        //3 stream
//        List<String> list3 = Arrays.stream(strArr).collect(Collectors.toList());
//        System.out.println(list3);
//
//        //int 배열을 list로 변환
//        //Arrays.asList() 객체 타입 필요해서 안 됨
//        //for문 담기 가능
//        int[] intArr = {10,20,30,40};
//        List<Integer> list4 = Arrays.stream(intArr).boxed().collect(Collectors.toList());
//        System.out.println(list4);
//
//        //String 리스트로 string 배열로 변환
//
//        List<String> list10 = new ArrayList<>();
//        list10.add("a");
//        list10.add("b");
//        list10.add("c");
//
//        String[] strArr = new String [list10.size()];
//
//        for (int i = 0; i < strArr.length; i++) {
//            strArr[i] = list10.get(i);
//        }
//        System.out.println(Arrays.toString(strArr));
//        String [] strArr2 = list10.stream().toArray(a -> new String[a]);
//        System.out.println(Arrays.toString(strArr2));



    }
}
