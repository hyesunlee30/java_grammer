package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {

        System.out.println(MyImplements.my_static);

        MyImplements mi = new MyImplements();
        System.out.println();
        mi.methodA();

        System.out.println(mi);

        MyImplements2 a = new MyImplements2();
        System.out.println(a.my_constant);
        System.out.println(a.a);


    }
}
interface MyInterface2 {
    String a = "abc";
    //    아래 변수는 컴파일 타임에 static final이 붙는다.
    int my_constant = 100; // 상수이자, 클래스 변수

    void method();
}

class MyImplements2 implements MyInterface2 {
    @Override
    public void method() {
    }
}