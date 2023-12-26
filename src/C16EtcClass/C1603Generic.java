package C16EtcClass;

import java.util.Arrays;

public class C1603Generic {
    public static void main(String[] args) {
        //Object 클래스는 최고 조상 클래스다.
        String[] stArr = {"java", "python", "c++"};
//        changeStringArr(stArr, 0, 1);
//        //0번째와 1번째 자리 change
        Integer[] intArr = {1,2,3,4,5};
//        //1번째 2번째 자리 change
//        changeIntegerArr(intArr, 1, 2);
        swap(stArr, 0,1);
        swap(intArr, 1,2);
        System.out.println(Arrays.toString(stArr));
        System.out.println(Arrays.toString(intArr));

        //제네릭클래스
        GenericStudent<String> studentStr = new GenericStudent<String>();
        studentStr.setValue("테스트", "30", "3반","1990415");
        System.out.println(studentStr.getAge().getClass());

        GenericStudent<Integer> studentInteger = new GenericStudent<Integer>();
        studentInteger.setValue("테스트", 30, 3,1990415);
        System.out.println(studentInteger.getAge().getClass());
    }
    static void changeStringArr(String[] stArr, int n, int n2) {
        //주소값이 있어 리턴하지 않아도 값이 변경되어 있따.
        String temp = stArr[n];
        stArr[n] = stArr[n2];
        stArr[n2] = temp;
    }
    static void changeIntegerArr(Integer[] integerArr, int n, int n2){
        Integer temp = integerArr[n];
        integerArr[n] = integerArr[n2];
        integerArr[n2] = temp;
    }
    //제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
    //제네릭은 객체 타입이 들어와야함에 유의
    static <T>void swap(T[] arr, int n, int n2){
        T temp = arr[n];
        arr[n] = arr[n2];
        arr[n2] = temp;
    }

}

class GenericStudent<T> {
    String name;
    T age;
    T classNumber;
    T birth;

    void setValue(String name, T age, T classNumber, T birth) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }

    public T getClassNumber() {
        return classNumber;
    }

    public T getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "GenericStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classNumber=" + classNumber +
                ", birth=" + birth +
                '}';
    }
}
