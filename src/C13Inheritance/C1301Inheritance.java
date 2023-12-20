package C13Inheritance;

public class C1301Inheritance extends Parents {
    int c = 30;
    public static void main(String[] args) {
        C1301Inheritance ih = new C1301Inheritance();
        System.out.println(ih.c);
        System.out.println(ih.a);
        //자식클래스라 하더라도 private 상속 및 접근 불가
        //System.out.println(ih.b);

        ih.parentMethod();
        ih.childMethod();
    }
    void childMethod() {
        System.out.println("자식클래스입니다.");
    }
    //오버라이딩 덮어쓰기
    @Override
    void parentMethod() {
        System.out.println("부모클래스가 아니라 자식클래스입니다.");
    }
}
class Parents{
    int a = 30;
    private int b = 20;
    void parentMethod() {
        System.out.println("부모클래스입니다.");
    }
}

