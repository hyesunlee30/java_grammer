import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08List {
    public static void main(String[] args) {
        //자료형 list
        // List<Integer> list -- 인터페이스
        // new ArrayList><(); -- 구현체
        //List<Integer> list = new ArrayList<>();
        //list 선언방법
        //ArrayList<String> myList = new ArrayList<String>();
        //ArrayList<String> myList = new ArrayList<>();
        // 가장 일반적인 방식
        //List<String> myList = new ArrayList<>();
        // 초기값 생성방법 1
        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("c#");
        myList.add("python");
        System.out.println(myList);
        
        //초기값 생성방법 2
        List<String> myList2 = new ArrayList<>(Arrays.asList("java","python","c++"));
        System.out.println(myList2);
        String[] myArr = {"java","python","c++"};
        List<String> myList3 = new ArrayList<>(Arrays.asList(myArr));
        System.out.println(myList3);
        
        //배열이 int인 경우 -> 형변환 문제발생
        int[] myIntArr1 = {1,2,3};
        //List<Integer> myIntList1 = new ArrayList<>(Arrays.asList(myIntArr1));

        // 이렇게 하면 된다.
        List<Integer> myIntList1 = new ArrayList<>();
        for (int mia : myIntArr1) {
            myIntList1.add(mia); //auto boxing
        }
        System.out.println(myIntList1);
        

    }
}
