package C12ClassLecture;

import solution.Combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {


    public static void main(String[] args) {

//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> combinations = new ArrayList<>();
//        //조합찾기 n 개 에서 m개를 뽑는다.
//        //1번이 뽑히면 선택할 수 있는 건 2,3,4
//        //2번이 뽑히면 선택할 수 있는 건 3,4
//        //3번이 뽑히면 선택할 수 있는 건 4
//        //4번은 이미 뽑혔다.
//        //for문으로만 했을때
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i+1; j < myList.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                combinations.add(temp);
//            }
//        }
//        //재귀에 대한 이해를 위한 변경
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> combinations = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i+1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                combinations.add(new ArrayList<>(temp)); // 주소값
//                temp.remove(temp.size()-1); // 1번째값 remove
//            }
//            temp.remove(temp.size()-1); // 0번째값 remove
//        }
//
//        System.out.println(combinations);

        //재귀
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combination_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(myList, combination_list,0, temp, 2);
        System.out.println(combination_list);

    }

    static void combination(List<Integer> myList, List<List<Integer>> combination_list, int start, List<Integer> temp, int m ) {

        if (temp.size() == m) {
            List<Integer> temp2 = new ArrayList<>();
            temp2.add(temp.get(0));
            temp2.add(temp.get(1));
            combination_list.add(temp2);
        } else {
            System.out.println("start "+start);
            for (int i = start; i < myList.size(); i++) {
                temp.add(myList.get(i));
                //combination(myList, combination_list,start+1, temp, m); //이렇게 하면 항상 1 그래서 i+1
                System.out.println(" i+1  "+(i+1));
                System.out.println(" start+1 "+(start+1));
                System.out.println("--------------");
                combination(myList, combination_list,i+1, temp, m);
                temp.remove(temp.size()-1); // 1번째값 remove
            }
        }
    }
}
