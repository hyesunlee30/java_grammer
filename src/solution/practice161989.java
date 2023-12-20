package solution;

import java.util.ArrayList;
import java.util.List;

public class practice161989 {
    public static void main(String[] args) {

        //덧칠하기
        //greedy
        //요구사항
        //start 값 end값
        //stert = 0;
        //end = 3;
        //1번
        //start = 4;
        //end = 8;
        //2번
        //start = 9;
        //end = 13;
        //start = 14;
        //end = 18;
        //start = 19;
        //end = 20;
        //3번

//        int n = 20; // 벽 길이
//        int m = 4; // 롤러의 길이
//        int[] section = {2, 3, 6,19}; // 벗겨져서 칠해야 하는 곳
        int n = 100; // 벽 길이
        int m = 4; // 롤러의 길이
        int[] section = {2, 3, 55,99}; // 벗겨져서 칠해야 하는 곳
        //3
        solution(n, m, section);
        //System.out.println(solution(n, m, section));

    }
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = 1;
        int end = m;
        for(int i = 0; i < section.length; i++) {
            System.out.println(i);
        }
//        while (end == n) {
//
//
//            end= n;
//        }
        return answer;
    }

}
