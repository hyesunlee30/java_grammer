package C15AnonymousLambda;

public class C1502AnonymousClass {
    public static void main(String[] args) {
        //클래스명이 Animal이 아닌 이름없는 익명클래스와 객체를 동시에 생성
//        Animal dog = new Animal() {
//            @Override
//            public void makeSound() {
//                System.out.println("왈ㅇ뢍뢍로아로아로아로아뢍ㄹ");
//            }
//        };
//        dog.makeSound();
        //익명객체에 구현메소드 1개밖에 없을 경우에 람다표현식(화살표함수)로 표현가능
        //replace rambda
        Animal cat = new Animal() {
            @Override
            public void makeSound(String a) {
                System.out.println("미야아아아아아아용");
            }
        };
        //replace rambda
        Animal cat2 = (String n) -> System.out.println("미야아아아아아아용 : "+n+" 이 울었다");
        cat2.makeSound("코숏");
    }
}
interface Animal {
    void makeSound(String a);
}
