package solution;

import java.util.Arrays;

public class practice161990 {
    public static void main(String[] args) {

        //요구사항 분석
        //wallpaper 정사각형
        //바탕화면의 가장 왼쪽 위를 (0, 0)
        //(세로 좌표, 가로 좌표)로 표현합니다.
        // 빈칸은 ".", 파일이 있는 칸은 "#"의 값을 가집니다.
        //드래그를 하면 파일들을 선택할 수 있고, 선택된 파일들을 삭제할 수 있습니다
        //머쓱이는 최소한의 이동거리를 갖는 한 번의 드래그로 모든 파일을 선택해서 한 번에 지우려고 하며
        //드래그는 바탕화면의 격자점 S(lux, luy)를 마우스 왼쪽 버튼으로 클릭한 상태로
        // 격자점 E(rdx, rdy)로 이동한 뒤 마우스 왼쪽 버튼을 떼는 행동입니다.
        // 이때, "점 S에서 점 E로 드래그한다"고 표현하고
        // 점 S와 점 E를 각각 드래그의 시작점, 끝점이라고 표현합니다.
        //점 S(lux, luy)에서 점 E(rdx, rdy)로 드래그를 할 때, "드래그 한 거리"는 |rdx - lux| + |rdy - luy|로 정의합니다.
        //점 S에서 점 E로 드래그를 하면 바탕화면에서 두 격자점을 각각 왼쪽 위, 오른쪽 아래로 하는 직사각형 내부에 있는 모든 파일이 선택됩니다.
        //드래그 시작점 (lux, luy)와 끝점 (rdx, rdy)는 lux < rdx, luy < rdy를 만족해야 합니다.

        String[] wallpaper ={".#...", "..#..", "...#."};

    }
    public static int[] solution(String[] wallpaper) {
        int[] answer = {};
        int[][] wp = new int[wallpaper.length-1][wallpaper.length-1];


        for (int i = 0; i < wallpaper.length; i++) {

            String[] text  = wallpaper[i].split("");
            System.out.println(Arrays.toString(text));

        }
        char[][] charArray;


        return answer;
    }
}
