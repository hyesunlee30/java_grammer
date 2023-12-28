package C18Thread;

//Thread클래스에 이미 구현되어 있는 run메서드는 아무작업도 하지 않는 빈 메서드
//작업하고 싶은 내용을 run() 메서드를 overriding 하여 정의할 수 있다.
//상속관계이다 보니, 다른 클래스 상속불가 : 단점->단점을 보완하기 위해 Runnable로 대체함
public class ExtendsThreadClass extends Thread{
    //run 메소드는 스레드가 시작되면 실행
    @Override
    public void run() {
        System.out.println("ExtendsThreadClass : "+Thread.currentThread().getName());
    }
}
