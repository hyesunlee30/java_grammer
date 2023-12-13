import java.util.*;
import java.util.stream.Collectors;

public class C10Set {
    public static void main(String[] args) {
//        //중복 없다. 순서없다.
//
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet); // 출력값 [e, h, l, o] 중복없고 순서없다
//
//        // 반 학생들이 좋아하는 운동 종목 list
//        // 좋아하는 종목수를 출력
//
//        List<String> list = new ArrayList<>();
//
//        list.add("축구");
//        list.add("축구");
//        list.add("농구");
//        list.add("농구");
//        list.add("농구");
//        list.add("농구");
//        list.add("테니스");
//        list.add("테니스");
//
//        Set<String> mySet = new HashSet<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            mySet.add(list.get(i));
//
//        }
//        System.out.println(mySet.size());
//
//        Set<String> mySet1 = new HashSet<>(list);
//
//        //배열을 인자값을 받아 set을 초기화
//        String[] arr = new String[3];
//        arr[0] = "a";
//        arr[1] = "b";
//        arr[2] = "c";
//
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        System.out.println(mySet2);
//
//        mySet2.remove("a");
//        System.out.println(mySet2);
//
//        int[] myInt = new int[3];
//        myInt[0] = 0;
//        myInt[0] = 1;
//        myInt[0] = 2;
//

        Set<String> mySet1 = new HashSet<>(Arrays.asList("java","python","javascript"));
        Set<String> mySet2 = new HashSet<>(Arrays.asList("java","html","css"));

        //교집합 retainAll - 매개변수로 주어지는것과 같은 것을 남긴다
        // a.retainAll(b) 동일한 것만 남음
        Set<String> temp1 = new HashSet<>(mySet1);
        temp1.retainAll(mySet2);
        System.out.println(temp1);

        //합집한 addAll - 다 합친다.
        // a.addAll(b) 모두 남는데 중복은 제거 된다

        //차집합 removeAll - 같은 걸 다 뺸다.
        // a.removeAll(b) 공통된 것만 빼준다.


    }
}
