package C15AnonymousLambda;

import java.util.*;
import java.util.stream.Collectors;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
        int[] arr = {20,10,4,12,20};
        Car car1 = new Car(20, 100,"kia");
        Car car2 = new Car(30, 900,"hyundai");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);


        //전통적인 방식의 데이터 접근방식, 원본데이터를 씀
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
        }

        //데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
        //java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
        //foreach : 스트림의 각 요소를 소모하면서 동작을 수행 , iterator와 같음. stream 객체에서 소모
        Arrays.stream(arr).forEach(System.out::println);

        Arrays.stream(arr).sorted().forEach(System.out::println);

        cars.stream().map(Car::getBrand).forEach(System.out::println);



        String[] strArr = {"hello","java","python"};
        String[] strArr1 = Arrays.stream(strArr).sorted().toArray(String[]::new);

        String[] strArr2 = Arrays.stream(strArr).filter(a-> !Objects.equals(a, "java")).toArray(String[]::new);
        System.out.println(Arrays.toString(strArr2));
    }
}

class Car {
    int sound;
    int speed;
    String brand;

    public Car(int sound, int speed, String brand) {
        this.sound = sound;
        this.speed = speed;
        this.brand = brand;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}