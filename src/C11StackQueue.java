import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueue {
    public static void main(String[] args) {
//        // 자료형 Stack
//        // LIFO 후입선출 가장 나중에 저장된 데이터가 먼저 나온다.
//        // Stack<Integer> st = new Stack<>();
//        // 주요메서드
//        // st.push(item) item 하나를 스택의 가장 윗 부분에 추가한다.
//        // st.pop() 스택의 가장 위에 있는 항목을 제거 후 반환
//        // st.peek() Peek() 메서드는 스택에서 개체를 제거하지 않고 개체 값만 반환. 즉, 스택은 데이터를
//        // st.isEmpty() 스택이 비어 있을 때에 true를 반환한다.
//        // 페이지 뒤로 가기
//        // 네이버 -> 구글 -> 다음 -> 다음1 -> 다음2;
//
//
//
//        Stack<Integer> mySt = new Stack<>();
//        int[] ar = {10,20,30};
//        for (int i =0; i<ar.length; i++) {
//            mySt.push(ar[i]);
//        }
//        int peek1 = mySt.peek();
//        System.out.println(peek1);
//        System.out.println(mySt);
//        int pop1 = mySt.pop();
//        System.out.println(pop1);
//        System.out.println(mySt);
//        Stack<String> history = new Stack<>();
//        String [] arr = {"네이버", "구글", "다음", "다음1", "다음2"};
//        for (int i = 0; i< arr.length; i++) {
//            history.push(arr[i]);
//        }
//        while(!history.isEmpty()) {
//            System.out.println(history.pop());
//        }
//
//
//        // 웹페이지 방문
//        // 방문한 사이트 출력 + 뒤로가기 기능 구현
//        // 스케너로 신규사이트 방문 뒤로가기
//        // 신규사이트방문일경우 -> 해당 주소를 추가 stack.push
//        // 뒤로가기 일 경우 -> stack.pop
//        Stack<String> page = new Stack<>();
//        Stack<String> page1 = new Stack<>();
//        while(true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("사이트 이름을 입력하세요. 뒤로 가시려면 back을 입력하세요. 다시 앞으로 가시려면 forward 라고 입력하세요");
//            String str = scanner.next();
//            String res = "";
//            if(str.equals("back")) {
//                if(page.isEmpty()) {
//                    System.out.println("더이상 뒤로 갈 수 없습니다.");
//                } else {
//                    page1.push(page.pop());
//                    res = page.peek();
//                }
//            } else if (str.equals("forward")) {
//                if(page1.isEmpty()) {
//                    System.out.println("더이상 앞으로 갈 수 없습니다.");
//                } else {
//                    page.push(page1.pop());
//                    res = page.peek();
//                }
//
//            } else {
//                res = page.push(str);
//            }
//            System.out.println("이동한 페이지 "+res);
//        }

//        //queue
//        Queue<Integer> myQue1 = new LinkedList<>();
//        myQue1.add(10);
//        myQue1.add(20);
//        myQue1.add(30);
//        System.out.println(myQue1.poll()); // 10
//        System.out.println(myQue1); //20, 30
//
//        //프린터대기열 예제
//        //문서1추가, 문서2추가,문서3추가
//        Queue<String> myQue2 = new LinkedList<>();
//        String[] a = {"문서1","문서2","문서3"};
//        for(int i = 0; i < a.length; i++) {
//            myQue2.add(a[i]);
//            System.out.println("문서대기열 추가 "+a[i]);
//        }
//        while (!myQue2.isEmpty()) {
//            System.out.println("문서 출력 "+myQue2.poll());
//        }

        //길이의 제한이 있는 큐 : ArrayBlockingQueue
        Queue<String> myQue3 = new ArrayBlockingQueue<>(5);
        // add, offer 의 차이
        // add는 길이가 다 찼을때 illiger 어쩌구 에러
        // offer은 가능할때 true 불가능하면 false

        String[] a = {"문서1","문서2","문서3","문서4","문서5","문서6","문서7"};
        for(int i = 0; i < a.length; i++) {
            //myQue3.add(a[i]);
            myQue3.offer(a[i]);
            System.out.println("문서대기열 추가 "+myQue3);
        }
        myQue3.clear();


        //우선순위큐(priorityQueue)
        //데이터를 넣을때 부분 정렬되어 큐의 최 상단에는 가장 작은값이 위치
        //힙 자료구조를 통해 구현되어 있음
        //힙 자료구조 - 최 상단에는 가장 작은값
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq); //[10, 30, 20, 40, 50] 최 상단에 제일 작은값은 올라가 있다.heapifi

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
