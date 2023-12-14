public class C1102StackFunction2 {
    public static void main(String[] args) {
        System.out.println("시작");
        System.out.println(function(1));
        System.out.println("끝");
    }

    static int function(int number) {
        System.out.println("함수 시작");
        System.out.println("함수 끝");
        return function(number*2);
    }

}
