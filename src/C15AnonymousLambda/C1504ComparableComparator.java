package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        //Comparable, Comparator
//        //Comparable compareTo 메서드가 선언,
//        //Comparator compara메서드가 선언
//        //유일한 메서드
//        //익명객체 만들 수 있겠다
//
//        //자바의 많은 클래스에서 구현하고 있다
//        //Comparable;
//        //자바의 많은 클래스에서 구현하고 있지 않다.
//        //Comparator;
//
//        //자료형이 달라서 비교방법이 다르다.
//        //comparable을 implements 해서 각자 구현함
//        //두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        //문자열의 자릿수의 차이가 발생할 때 그 문자의 유니코드 값의 차이를 반환한다.
//        String a = "hello";
//        String b = "world";
//        //뭐가 우선인지 따지는 것 - 인지 + 인지만 알면됨
//        if(a.compareTo(b) < 0) {
//            System.out.println("a가 우선합니다.");
//        }
//        System.out.println(a.compareTo(b));
//        List<String> myList = new ArrayList<>();
//        myList.add("b");
//        myList.add("a");
//        //myList 집어넣으면 무조건 오름차순 정렬
//        //comparable로 활용, compareTo 메소드를 통해 정렬
//        Collections.sort(myList);
//        System.out.println(myList);
//
//        Integer intA = 1;
//        Integer intB = 2;
//        System.out.println(intA.compareTo(intB));
//        //일반적으로 직접 구현해서 사용하는 방식
//        //Comparator 인터페이스는 익명객체로 선언해서 사용한다.
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("b");
//        myList2.add("c");
//        myList2.add("a");
//        Collections.sort(myList2,Comparator.reverseOrder());
//        System.out.println(myList2);
        List<Student> students = new ArrayList<>();
        Student studentA = new Student("테스트A", 20);
        Student studentB = new Student("테스트B", 30);
        Student studentC = new Student("테스트C", 40);
        Student studentD = new Student("테스트D", 50);
        Student studentE = new Student("테스트E", 60);
        students.add(studentE);
        students.add(studentC);
        students.add(studentD);
        students.add(studentA);
        students.add(studentB);
//        for (Student student : students) {
//            System.out.println(student.getAge()+", "+student.getName());
//        }

        //toString
        //조상클래스인 Object 클래스의 toString을 overriding하여 객체호출시 자동으로 toString메서드 호출
        System.out.println(students);
        //음수 왼쪽, 0 같음 양수 오른쪽

        //현재 students는 들어간 순서대로 있음
        //방법1 : Comparator를 익명객체 방식으로 활용하여 정렬하는 방법, 매개변수 2개
        //나이
        //양수는 뒤집고
        //음수는 그냥 둔다.
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return  o1.getAge() - o2.getAge(); //오름차순 음수 왼쪽, 양수 오른쪽 0 -1 = -1 그럼 o2를 왼쪽으로
                return  o2.getAge() - o1.getAge(); //내림차순 음수 왼쪽, 양수 오른쪽 1 - 0 = 1 그럼 양수는 바꿔준다.
            }
        });
        System.out.println(students);
        students.sort((o1,o2)-> o1.getAge() - o2.getAge());//오름차순
        students.sort((o1,o2)-> o2.getAge() - o1.getAge());//내림차순

        students.sort((o1,o2)-> o1.getName().compareTo(o2.getName())); // 오름차순
        students.sort((o1,o2)-> o1.getName().compareTo(o2.getName())); // 내림차순

        String[] stArr = {"hello", "java", "C++", "world"};
        Arrays.sort(stArr, (o1, o2) -> o1.length() - o2.length());//Comparator를 람다식으로 바꾼거라서 Comparator를 안 써도 됨.
        //글자길이 내림차순
        Queue<String> myQueue = new PriorityQueue<>((o1,o2) -> o2.length() - o1.length());

        //3,30,34,5,9 가장 큰 문자를 구하라
        String[] str = {"3","30","34","5","9"};



        //방법2 : Comparable 인터페이스 implements 후 compareTo메서드 구현, 매개변수 1개
        //comparable을 상속해서 comparTo를 구현해서 사용할 수 있다.
        //객체의 compareTo를 찾아서 하는것.
        //Collections 객체의 compareTo
        //Collections.sort(students);

        //Thread 와 Runnable
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.1");
            }
        });

        t1.start();
        //runable 객체가 들어오기로 약속되어 있어서 익명함수 넣을 수 있다.
        //rambda
        new Thread(()-> System.out.println("새로 만든 쓰레드 입니다.2")).start();
        System.out.println("main의 쓰레드 입니다.");



    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                " 이름은'" + name + '\'' +
                ", 나이는=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getName().compareTo(this.name);
        //return this.name.compareTo(o.getName());
    }
}