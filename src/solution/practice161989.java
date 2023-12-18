package solution;

public class practice161989 {
    public static void main(String[] args) {

        //덧칠하기
        //요구사항
        int n = 20; // 벽 길이
        int m = 4; // 롤러의 길이
        int[] section = {2, 3, 6,19}; // 벗겨져서 칠해야 하는 곳
        //3
        System.out.println(solution(n, m, section));

    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if((i % m) == 0) {
                System.out.println();
            }
            for (int j = 0; j < section.length; j++) {
                if(i == section[j] && (i % m) == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
