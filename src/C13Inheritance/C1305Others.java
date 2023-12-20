package C13Inheritance;

//import java.util.* : util 하위의 모든 클래스/인터페이스 파일 import 가능
//import java.* : 불가능, 특정 패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//final 클래스 상속불가
//public class C1305Others extends FinalClass{
public class C1305Others {
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makeSound();
        myDog.makeSound1();
        myDog.makeSound2();

        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound() {

            }
        };
        //결과값 : class C13Inheritance.C1305Others$1 ,자식 클래스 없이 현재 이클래스에서 즉시 구현
        //익명클래스
        System.out.println(myAnimal.getClass());

        //결과값 : class C13Inheritance.C1305Dog
        System.out.println(myDog.getClass());



    }

}
final class  FinalClass {

}

abstract class C1305Animal {
    //final 메소드는 오버라이딩 불가
//    final void makeSound () {
//        System.out.println("동물은 소리를 냅니다");
//    }
//    void makeSound () {
//        System.out.println("동물은 소리를 냅니다");
//    }
    abstract void makeSound ();
    void makeSound1 () {
        System.out.println("소리를 낸다");
    };
}
class C1305Dog extends C1305Animal{
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
    @Override
    void makeSound1() {
        System.out.println("왈왈");
    }
    void makeSound2() {
        System.out.println("멍왈멍왈");
    }
}