package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        AnimalInterface1 myCat = new CatImplements();
        myCat.makeSound();
        // myCat.play(); 사용 못함. AnimalInterface1에 없음
        AnimalInterface1 myDog = new DogImplements();
        myDog.makeSound();

        //다형성이란 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미.
        CatMultiImplements myMultiCat = new CatMultiImplements();
        AnimalInterface1 myMultiCat2 = new CatMultiImplements();
        myMultiCat.makeSound();
        System.out.println(myMultiCat.play("철수","영희"));
        //AnimalInterface1로 선언하면 AnimalInterface
        //System.out.println(myMultiCat2.play("철수","영희"));

        DogMultiImplements myMultiDog = new DogMultiImplements();
        myMultiDog.makeSound();
        System.out.println(myMultiDog.play("나미", "영수"));

        //기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
        AnimalInterface1 a1 = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };

    }
}
