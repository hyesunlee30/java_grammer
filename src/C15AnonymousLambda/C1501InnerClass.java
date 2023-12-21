package C15AnonymousLambda;

public class C1501InnerClass {

    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();
    }
}

class MemberInnerClass {
    //static 내부 클래스
    //이 클래스는 외부클래스의 정적멤버처럼 활용

    static class StaticInnerClass {
        private int data;
        void display() {
            System.out.println("data 값은 "+data+"입니다.");
        }
    }
}

