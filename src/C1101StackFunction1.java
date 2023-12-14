public class C1101StackFunction1 {
    public static void main(String[] args) {

        System.out.println("시작");

        function();
        System.out.println("끝");
    }

    static void function() {
        System.out.println("함수 시작");
        function2();
        System.out.println("함수 끝");
    }

    static void function2() {
        System.out.println("함수2 시작");
        System.out.println("함수2 끝");
    }
}
