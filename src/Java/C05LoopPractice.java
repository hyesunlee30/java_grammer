package Java;

public class C05LoopPractice {
    public static void main(String[] args) {
//        //짝수의 합 1부터 20까지 계산하기
//        int sum = 0;
//        for (int i = 1; i <21; i++) {
//            if(i%2 == 0) {
//                sum += i ;
//            }
//        }
//        System.out.println(sum);
//
//        // 뒤집기
//        // % 10
//        int num = 1234;
//        int result = 0;
//        while(true) {
//            int temp = num % 10; // 떼어내기
//            result = (result *10) + temp; // 한칸씩 올리기
//            num /= 10; // 뗴어내고 남은 값
//            if(num == 0) {
//                break;
//            }
//        }
//        System.out.println(result);
//
//        // 최대공약수 구하기 12, 24, 두 수를 나눴을 때 가장 큰 값
//        // 24, 36
//        // 더 큰값을 나누세요
//        int a = 24;
//        int b = 36;
//        int min = a > b ? b:a;
//        int maxNum = 0;
//        //12
//        for (int i =1; i<=min; i++) {
//            if(a%i == 0 && b%i == 0) {
//                maxNum = i;
//            }
//        }
//        //최대공배수
//        int miniNum = a/maxNum * b/maxNum * maxNum;
//
//        //배열과 Enhanced for문
//
//        int[] myArr ={1,5,7,9,10};
//
//        for (int i =0; i<5; i++) {
//            System.out.println(myArr[i]);
//        }
//        for (int a : myArr) {
//            System.out.println(a);
//        }
//
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] +=10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
//        int cnt = 0;
//        for(int a : myArr) {
//            myArr[cnt] = a+10; // 복사본이라서 원본이 바뀌지 않는다.
//            cnt++;
//        }
//        System.out.println(Arrays.toString(myArr));
//
//        //기본형 = stack
//        //참조형 = heap 메모리 저장 후 주소를 stack
//
//        //자바 변수의 유효범위 {} 로 유효해진다.
//
//        int num = 10;
//        if(num > 1) {
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(abc); // if문 안에서 정의된 변수는 접근이 불가하다
//        System.out.println(num); // if문 밖에서 선언된 변수값을 if안에서 접근하여 변경가능
//
//        //다중반복문
//        for (int i =2; i < 10; i++) {
//            System.out.println(i+"단 입니다.");
//            for(int j = 1; j <10; j++) {
//                System.out.println(i+" X "+j+" = "+i*j);
//            }
//            System.out.println("----------");
//        }
//
//        //2중 for문을 통해 배열접근
//        int[][] arr = {{1,2,3,4},{5,6,7,8}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
//
//        int[] arr = {1,2,3,4};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(i%2 == 0) {
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println(sum);
//
//        // 라벨문
//        // 이중 포문에서 안쪽 포문에서 바깥에 있는 포문을 종료
//        loop1:
//        for(int i =0; i<5; i++) {
//            loop2:
//            for(int j = 0; j <5; j++) {
//                System.out.println("hello world i "+i+" j "+ j);
//                if(j==2) {
////                    break;
//                    break loop1;
//                }
//            }
//        }
//
//        //target이 matrix에 i, j 번째에 있는지 출력
//        //라벨문 활용1
//        int[][] matrix = {{1,2,3,4}, {5,6,7}, {8,9},{10,11,12,13,14}};
//        int target = 14;
//        l1:
//        for (int i = 0; i < matrix.length; i++) {
//            l2:
//            for(int j =0; j < matrix[i].length; j++) {
//                if(matrix[i][j] == target) {
//                    System.out.println("타겟은 "+i+", "+j+" 번째에 있다");
//                    break l1;
//                }
//            }
//        }
//
//        //라벨문 활용2
//        //1~20 숫자가 있을 때 1약수 1, 2약수 1,2, 3약수 1,3, 6약수 1,2,3,6
//        // 이 중에 약수가 5개 이상인 숫자 중에 가장 작은 값을 구하시요.
//        // 약수는 a / b 를 나눴을때 0이 나오면 b는 a의 약수다
//
//
//        int min = 0;
//        l1:
//        for (int i = 1; i <21; i++) {
//            int a = 0;
//            l2:
//            for (int j = 1; j<=i; j++) {
//                if(i%j == 0) { // 약수를 구하고
//                    a++;      //약수가 몇 개인지 세고
//                    if(a > 5) { // 5개 이상일때
//                        min = i; // 약수의 작은값이 아니라, 숫자 중에 가장 작은 값을 구하라고 한 것이라서.
//                        break l1;
//                    }
//                }
//            }
//        }
//        System.out.println(min);
//
//        int answer = 0;
//        for (int i = 1; i < 21; i++) {
//            int count = 0;
//            for (int j =1; j < i; j++) {
//                if (i % j == 0) {
//                    count++;
//                    answer = i;
//                }
//                if(count == 5) {
//                    break;
//                }
//            }
//            if (count >= 5) {
//                System.out.println(answer);
//                break;
//            }
//        }


    }
}
