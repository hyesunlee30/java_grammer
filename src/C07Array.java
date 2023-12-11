import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        //자료형 배열
//        //literal 방법으로 초기화
//        int[] int_arr1 = {1,2,3,4};
//        //길이 지정
//        int[] int_arr2 = new int[4];
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;
//        // 그냥 1번 쓰면됨
//        int[] int_arr3 = new int[]{1,2,3,4};
//        // 표현식 4는 불가, 반드시 길이가 지정되어야함
//        //int[] int_arrs = new int[];
//
//        String[] arr_st = new String[5]; // null 에러가 난다.
//
//        for (int i =0; i<arr_st.length; i++) {
//
//            if(arr_st[i].isEmpty()) { // npe 컴파일 에러
//                System.out.println("");
//            }
//        }
//
//        //85,65,90 int 배열을 선언한 뒤 총합 평균값
//
//        int[] arr = {85,65,90};
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i< arr.length; i++) {
//            sum = sum + arr[i];
//
//        }
//        avg = sum / arr.length;
//        System.out.println(sum);
//        System.out.println(avg);
//        int[] arr = {10,20,30,12,8,17};
//        int min = arr[0];
//        int max = arr[0];
//        for(int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//
//        //배열의 순서바꾸기
//        int[] arr = {10,20};
//        int a = arr[0];
//        arr[0] = arr[1];
//        arr[1] = a;
//        System.out.println(arr[0]+" "+arr[1]);
//
//        // 정렬 처음부터 끝까지. 10을 마지막으로
//        int[] arr2 = {10,20,30,40,50,60,70};
//
//        for (int i = 0; i<arr2.length-1; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));
//
//
//        // 신규 배열에 뒤집은 값을 담는다.
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = new int[arr.length];
//
//        for (int i = arr.length-1; i > -1; i--) {
//            arr2[i] = arr[arr.length-i-1];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            arr2[arr2.length-1-i] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(arr2));
//        int[] arr = {1,2,3,4,5};
//        // 자리 바꾸기
//        for (int i = 0; i<arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i]; // 하나씩 줄어든다
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // Arrays 클래스 메소드 정렬 sort 함수 사용
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr); // 오름차순 정렬
//        System.out.println(Arrays.toString(arr));
//
//        //내림차순
//        //방법 1.Comparator클래스 사용
//        //객체타입인 경우에만 Comparator클래스 사용 가능
//        String[] st_Arr = {"hello","hi","bye","goodmoring"};
//        Arrays.sort(st_Arr);
//        System.out.println(Arrays.toString(st_Arr));
//        //Comparator.reverseOrder() static
//        Arrays.sort(st_Arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_Arr));
//        //Arrays.sort(arr, Comparator.reverseOrder()); //안됨 객체가 아니라서
//        Integer[] arr_integer = {5,1,2,7,3,1,2};
//
//        Arrays.sort(arr_integer,Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));
//        //배열뒤집기
//        // temp 에 지금값을 담고
//        // 지금값주소에 = 마지막값을 담고
//        // 마지막주소에 = temp 를 담는다.
//        for (int i=0; i < arr.length; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i]; // 하나씩 줄어든다
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        //stream Api lambda를 활용한 내림차순 정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        int[] new_arr = Arrays.stream(arr) //stream 객체 생성, 복사를 했다
//                .boxed() // int를 integer로 박싱
//                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
//                .mapToInt(a -> a) /// int로 변환
//                .toArray();
//
//        System.out.println(Arrays.toString(new_arr));
//
//        //선택정렬
//        int[] a = {30,22,20,25,12};
//        // 마지막 두개는 비교 못 함 a.length -1;
//        for (int i = 0; i < a.length-1; i++) {
//            int min = a[i];
//            for (int j = i+1; j < a.length; j++ ) {
//                if (min > a[j]) {
//                    min = a[j];
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//        //선택정렬
//        // 마지막 두개는 비교 못 함 a.length -1;
//        for (int i = 0; i < a.length-1; i++) {
//            int max = a[i];
//            for (int j = i+1; j < a.length; j++ ) {
//                if (max < a[j]) {
//                    max = a[j];
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(a));
//        //시간복잡도
//        //빅오 O(n);
//        //이중for문은 O(n^2) 느리다
//        //n
//        //logn 승수값이 logn의 결과값 1024는 2^10 n = 10
//        // 기하급수적으로 -> 제곱으로 간다
//        // 산술급수적으로 -> 더하기로 간다ㄴ
//        // 문제는 맞았다 -> 효울성 X 시간 초과
//        //메모리복잡도
//
//        //숫자 조합의 합 : 각기 다른 숫자의 배열이 있을때 만들어 질 수 있는 2개의 조합의 합을 출력하라.
//        //10-20, 10- 30, 10 - 40, 20-10// 안 해도 된다.
//        int[] numbers_combination = new int[numbers.length*numbers.length];
//        int combination_count = 0;
//        for (int i = 0; i<numbers.length-1; i++) {
//            for (int j = i+1; j <numbers.length; j++) {
//                numbers_combination[combination_count] = numbers[i]+numbers[j];
//                combination_count++;
//            }
//        }
//        int[] temp = Arrays.copyOfRange(numbers_combination, 0, combination_count);
//        int[] temp2 = new int[temp.length];
//        Arrays.sort(temp);
//        int cnt = 0;
//        for (int i = 0; i < temp.length-1; i++) {
//            if(temp[i] != temp[i+1]) {
//                temp2[cnt] = temp[i];
//                cnt++;
//            }
//        }
//        temp2[cnt++] = temp[temp2.length-1]; //index를 넣어주는 거라서 -1를 해줘야 함
//
//        return Arrays.copyOfRange(temp2, 0, cnt);
//
//        //중복제거하기
//        //int[] temp = {10,10,40,40,5,7};
//        // 정렬이 선행되어야 가능한 로직이다.
//        Arrays.sort(temp);
//        //int[] new_temp = Arrays.copyOfRange(temp, 0, 3);
//        //배열은 길이가 정해져 있습니다. 미리 선언해야한다.
//        int[] temp2 = new int[temp.length-1];
//        int cnt = 0;
//        for (int i = 0; i < temp.length-1; i++) {
//            if(temp[i] != temp[i+1]) {
//                temp2[cnt] = temp[i];
//                cnt++;
//            }
//        }
//        temp2[cnt++] = temp[temp2.length];
//        int[] answer = Arrays.copyOfRange(temp2, 0, cnt);
//        System.out.println(Arrays.toString(answer));
//
//        //버블정렬
//        // i는 전체 반복횟수를 결정
//        // j는 i가 증가할수록 마지막자리가 i만큼 줄어듬
//        // i보다 i+1 이 더 작으면 자리체인지
//        // 큰 걸 오른쪽으로 밀어낸다.
//        // arr[j] 와 arr[j+1]을 비교하기 떄문에 j는 arr.length-i-1까지다.
//        int [] arr = {5,1,4,3,2};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j<arr.length-i-1; j++) { // 값을 하나 더 빼줘야하는데  j+1 하면서 보기 때문에 j 값에서 -1 g해야힘
//                if (arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // 효율화 밖에 for문에  arr.length-1
//        // 변경이 일어났는지 체크해서
//        int [] arr1 = {5,1,2,3,4}; // 정렬이 완료 되어도 계속 for문이 돈다.
//
//        for (int i = 0; i < arr1.length-1; i++) {
//            boolean check = false; // 초기화가 되어야 하는데, 계속 true인 상태로 이어지기 때문에
//            for (int j = 0; j<arr1.length-i-1; j++) { // 값을 하나 더 빼줘야하는데  j+1 하면서 보기 때문에 j 값에서 -1 g해야힘
//                if (arr1[j] > arr1[j+1]) {
//                    int temp = arr1[j];
//                    arr1[j] = arr1[j+1];
//                    arr1[j+1] = temp;
//                } else {
//                    check = true;
//                }
//            }
//            if(check) {
//                break;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr1));


        //배열의 검색
        int[] arr = {5,3,1,8,7};
        int answer = 0;
        for (int i =0; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
