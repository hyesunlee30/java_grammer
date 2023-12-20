package C13Inheritance;

import java.util.LinkedList;
import java.util.List;

public class C1303MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        //상속관계일때 부모클래스타입을 자식클래스객체의 타입으로 지정가능
        //Animal 클래스에 정의된 메서드만 사용가능하도록 제약이 발생
        //다형성
        Animal ca = new Cat();

        a.sound();
        d.sound();
        c.sound();
        ca.sound();

        //LinkedList에 100개 기능이 있으면, List에는 49개 있다.
        //List에서만 정의한 49개만 쓸 수 있다.
        //Queue라고 쓰면 Queue에서 쓰는 51개를 쓸 수 있다.
        //List에서 add하나 Queue에서도 add 하나 둘 다 쓸 수 있다.
        // 각각 구현한 add overriding 한 거임.
        //LinkedList로 선언하고 List를 쓰는 이유는
        //LinkedList 대신 ArrayList로 바꿔낄 수 있기 때문이다.
        //각 구현 방법이 다르기 때문에.
        List<String> myList = new LinkedList<>();
    }

    static class Animal {
        void sound() {
            System.out.println("동물은 소리를 냅니다.");
        }
    }

    static class Dog extends Animal{
        @Override
        void sound() {
            System.out.println("멍멍");
        }
    }

    static class Cat extends Animal{
        @Override
        void sound() {
            System.out.println("야옹");
        }
    }
}


