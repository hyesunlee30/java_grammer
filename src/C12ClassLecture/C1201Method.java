package C12ClassLecture;

public class C1201Method {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <11; i++) {
            total += i;
        }

        int tota2 = 0;
        for(int i = 1; i <11; i++) {
            tota2 += i;
        }

        //코드의 중복이 발생하므로, 코드의 반복피하기 위해 특정 기능집합을 별도로 분리
        System.out.println(sumAcc(100,200));
        //같은 클래스내의 메소드들 사이에서의 호출음 static메서드라 할지라도 클래스명 생략가능.
        System.out.println(sumAcc(100,200));
        //메서드 구성요소 : 매개변수, 반환타입, 접근제어자, 클래스메서드여부(static)-> 없으면 객체메서드(instantmethod)
    }

    static  int sumAcc(int start, int end) {

        int total = 0;
        for (int i = start; i < end; i++) {
            total += i;
        }
        return total;
    }
}
