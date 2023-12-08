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

        //stream Api lambda를 활용한 내림차순 정렬
        int[] arr = {5,1,2,7,3,1,2};
        int[] new_arr = Arrays.stream(arr) //stream 객체 생성, 복사를 했다
                .boxed() // int를 integer로 박싱
                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                .mapToInt(a -> a) /// int로 변환
                .toArray();

        System.out.println(Arrays.toString(new_arr));

    }

}
