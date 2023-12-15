package C12ClassLecture;

public class Test {
    public static void main(String[] args) {
        // stack은 호출시 stack에 쌓인다
        // 호출이 되어 stack에 쌓이고
        // 다시 호출이 되어 또 쌓인다
        // 재귀함수의 경우 사용 되게 되는데
        // 빠져나가는 것이 없을 경우 stackOverFlow가 생기지 않도록. 조심해야한다.
        // 기본자료형 변수와 메소드 호출 파라미터들이 쌓인다

        recursive();

    }
    static void recursive() {
        recursive();
    }
}
