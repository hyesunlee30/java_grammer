package C12ClassLecture;

import solution.Combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {

    static int n = 4;
    static int m = 3;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combinations = new ArrayList<>();
        //조합찾기 n 개 에서 m개를 뽑는다.
        //1번이 뽑히면 선택할 수 있는 건 2,3,4
        //2번이 뽑히면 선택할 수 있는 건 3,4
        //3번이 뽑히면 선택할 수 있는 건 4
        //4번은 이미 뽑혔다.
        for (int i = 0; i < myList.size(); i++) {
            for (int j = i+1; j < myList.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(myList.get(i));
                temp.add(myList.get(j));
                combinations.add(temp);
                System.out.println(temp);
            }
        }

        //combination(0);
    }

//    static void combination(int depth) {
//        if (depth == m) {
//            return;
//        }
//        for (int i = 0; i < n;) {
//
//        }
//    }
}
