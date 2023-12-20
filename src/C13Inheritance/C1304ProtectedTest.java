package C13Inheritance;

public class C1304ProtectedTest extends C1304ProtectedClass{
    public static void main(String[] args) {
        C1304ProtectedClass c = new C1304ProtectedClass();

        //private
        //private String st1 접근 불가능.
        //dafualt 접근 가능
        System.out.println(c.st2);
        //protected 접근 가능
        System.out.println(c.st3);
        //public 접근 가능
        System.out.println(c.st4);

        C1304ProtectedTest pc = new C1304ProtectedTest();
        System.out.println(pc.st3);

    }
}
