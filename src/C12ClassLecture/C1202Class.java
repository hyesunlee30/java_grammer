package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {
        System.out.println(MyCalculator.sum(1,2));
        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        int total = MyCalculator.sum_acc(30);
        System.out.println(total);
        System.out.println(MyCalculator.total);

        //A 부서의 매출
        MyCalInstance myCalA = new MyCalInstance();
        myCalA.sum_acc(10);
        myCalA.sum_acc(20);
        myCalA.sum_acc(40);
        System.out.println(myCalA.total);

        //B 부서의 매출
        MyCalInstance myCalB = new MyCalInstance();
        myCalB.sum_acc(10);
        myCalB.sum_acc(20);
        myCalB.sum_acc(30);

        System.out.println(myCalB.total);
    }
}
//내부 클래스
//public은 하나여야한다. public class는 파일이름가 같아야 한다.
class MyCalculator {
    static int total = 0;
    static int sum (int a, int b) {
        return a+b;
    }
    static int sum_acc (int a) {
        return total =+ a;
    }
}

class MyCalInstance {
    int total = 0;
    int sum (int a, int b) {
        return a+b;
    }
    void sum_acc (int a) {
        // this는 객체 그 자신을 의미한다
        // static int total 일 경우 변수는 외부 클래스에서 MyCalInstance.total 했을 경우 접근 못한다.
        // 그래서 this = MyCalInstance 이기 때문에 this.total 했을 경우 접근 못한다.
        // static 변수는 static 내부 클래스에서 접근할 수 있다.
        // this를 굳이 왜 붙일까? 파라미터와 맴버 변수와 헷갈릴 수 있기 때문에 this를 사용한다.
        this.total =+ a;
    }
}
