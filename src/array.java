import java.util.*;

public class array {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        int[][] a = solution(data, "date",20300501, "remain");
    }
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        //data 데이터
        // ext 어떤 정보를 기준으로
        // val_ext 뽑아낼 정보의 기준값
        //sort_by 정렬
        //code, 제조일, 최대 수량, 현재 남아있는 값

        String[] index = {"code","date","maximum","remain"};
        int findColumn = 0;
        int sortColumn = 0;

        for (int i = 0; i < index.length; i++) {
            if(index[i].equals(ext)) {
                findColumn = i;
            };
            if(index[i].equals(sort_by)) {
                sortColumn = i;
            }
        }

        Date d = new Date(val_ext);

        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (findColumn == j && val_ext > data[i][j]) {

                }
                System.out.println(data[i][j]);
            }

        }



        return answer;
    }
}
