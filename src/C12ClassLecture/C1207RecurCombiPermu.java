package C12ClassLecture;

import solution.Combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {

    static int answer = 0;

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
//
//        //조합
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> combination_list = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        combination(myList, combination_list,0, temp, 2);
//        System.out.println(combination_list);
//
//        //순열 -- start 값이 필요 없음.
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> permutation_list = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visited = new boolean[myList.size()];
//        permutation(myList, permutation_list, temp, 2, visited);
//        System.out.println(permutation_list);
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> permutation_list = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visited = new boolean[myList.size()];
//        permutation6(myList, permutation_list, temp, 2, visited);
//        System.out.println(permutation_list);
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> permutation_list = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visited = new boolean[myList.size()];
//        permutation6All(myList, permutation_list, temp,visited);
//        System.out.println(permutation_list);

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> permutation_list = new ArrayList<>();

        boolean[] visited = new boolean[myList.size()];
        permutation6M(myList, visited, 0, 0);
        System.out.println(answer);

    }

//    static void combination(List<Integer> myList, List<List<Integer>> combination_list, int start, List<Integer> temp, int m ) {
//
//        if (temp.size() == m) {
//            combination_list.add(new ArrayList<>(temp));
//        } else {
//            System.out.println("start "+start);
//            for (int i = start; i < myList.size(); i++) {
//                temp.add(myList.get(i));
//                //combination(myList, combination_list,start+1, temp, m); //이렇게 하면 항상 1 그래서 i+1
//                System.out.println(" i+1  "+(i+1));
//                System.out.println(" start+1 "+(start+1));
//                System.out.println("--------------");
//                combination(myList, combination_list,i+1, temp, m);
//                temp.remove(temp.size()-1); // 1번째값 remove
//            }
//        }
//    }
//    static void permutation(List<Integer> myList, List<List<Integer>> permutation_list, List<Integer> temp, int m, boolean[] visited ) {
//
//        if (temp.size() == m) {
//            permutation_list.add(new ArrayList<>(temp));
//        } else {
//            for (int i =0; i < myList.size(); i++) {
//
//                if (!visited[i]) {
//                    System.out.println(" myList.get(i) "+myList.get(i));
//                    visited[i] = true;
//                    temp.add(myList.get(i));
//                    permutation(myList, permutation_list, temp, m, visited);
//                    visited[i] = false;
//                    temp.remove(myList.get(i));
//                }
//            }
//        }
//    }
//    static void permutation6(List<Integer> myList, List<List<Integer>> permutation_list, List<Integer> temp, int m, boolean[] visited ) {
//
//        // 합계가 6 이상인 2개 순열만 add
//        if (temp.size() == m ) {
//            int sum = 0;
//            for (int i = 0; i<temp.size(); i++) {
//                sum += temp.get(i);
//            }
//            if (sum >= 6) {
//                permutation_list.add(new ArrayList<>(temp));
//            }
//
//        } else {
//            for (int i =0; i < myList.size(); i++) {
//                if (!visited[i]) {
//                    System.out.println(" myList.get(i) "+myList.get(i));
//                    visited[i] = true;
//                    temp.add(myList.get(i));
//                    permutation6(myList, permutation_list, temp, m, visited);
//                    visited[i] = false;
//                    temp.remove(myList.get(i));
//                }
//            }
//        }
//    }
//
//    static void permutation6All(List<Integer> myList, List<List<Integer>> permutation_list, List<Integer> temp, boolean[] visited ) {
//
//        // 합계가 6 이상인 모든 순열 add temp.size 변화시키거나. 길이제한
//        int sum = 0;
//        for (int i = 0; i<temp.size(); i++) {
//            sum += temp.get(i);
//        }
//        if (sum >= 6) {
//            permutation_list.add(new ArrayList<>(temp));
//        }
//        for (int i =0; i < myList.size(); i++) {
//            if (!visited[i]) {
//                System.out.println(" myList.get(i) "+myList.get(i));
//                visited[i] = true;
//                temp.add(myList.get(i));
//                permutation6All(myList, permutation_list, temp,visited);
//                visited[i] = false;
//                temp.remove(myList.get(i));
//            }
//        }
//
//    }
    static void permutation6M(List<Integer> myList,boolean[] visited, int temp, int count) {

        // 모든 순열에서 합계가 가장 큰 값 차기 max찾기 알고리즘 static 활용.
        //4개중 3개 뽑는다.
        if(count == 3) {
            if(answer < temp) {
                answer = temp;
            }
            return;
        }
        for (int i =0; i < myList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                //temp += myList.get(i);
                permutation6M(myList, visited, temp+myList.get(i),count+1);
                //temp -= myList.get(i); // 백트래킹
                visited[i] = false;
            }
        }

    }

}
