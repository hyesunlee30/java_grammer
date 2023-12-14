import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
//        //우선순위큐(priorityQueue)
//        //데이터를 넣을때 부분 정렬되어 큐의 최 상단에는 가장 작은값이 위치
//        //힙 자료구조를 통해 구현되어 있음
//        //힙 자료구조 - 최 상단에는 가장 작은값
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //[10, 30, 20, 40, 50] 최 상단에 제일 작은값은 올라가 있다.heapifi
//
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }
        // 힙정렬
        // 각 노드의 갑이 지식 노드들의 값보다 크거나 같은 - 최대 힙
        // 각 노드의 값이 자식 노드들의 값보다 작거나 같은 - 최소 힙
        // Heapify 알고리즘 시간 복잡도 O(log N)
        // 힙 정렬의 전체 시간 복잡도는 힙 생성(Heapify)알고리즘 시간 복잡도 O(log N) * 전체 데이터 수 N = O(N * logN)
        //int[] arr = {5,12,3,5,7,8,1,2};
        int[] scoville = {10,1,1,1};
        int K = 10;
        //2
        System.out.println(solution(scoville, K));
    }

    public static  int solution(int[] scoville, int K) {
        //스코빌 지수를 k 이상
        //스코빌 지수가 가장 낮은 두 개의 음식
        //섞은 스코빌 = 안매움 음식 + 두번째로 안 매움 *2
        //K 이상으로 만들기 위해 최소 횟수
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while (true) {
            if(K <= pq.peek()) { //제일 작은 수가 k랑 같거나 이상이면 멈춤
                break;
            }
            else if(pq.size() == 1 && pq.peek() < K) { //1개밖에 없는데 K보다 작으면 break
                answer = -1;
                break;
            } else {
                answer++;
                int sum = pq.poll()+(pq.poll()*2);
                pq.add(sum);
            }
        }
        return answer;
    }
}
