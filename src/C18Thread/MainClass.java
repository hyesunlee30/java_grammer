package C18Thread;

public class MainClass {
    public static void main(String[] args) {
//        //상속방식으로 스레드 생성
//        //스레드 실행시 순서가 보장되지 않게 나온다.
//        Thread etc1 = new ExtendsThreadClass();
//        etc1.start();
//        Thread etc2 = new ExtendsThreadClass();
//        etc2.start();
//        new ExtendsThreadClass().start();
//
//        //Thread 생성자로 Runnable 객체를 주입하는 방식
//        //Thread클래스에 Runnable객체가 전달되어 사용자가 직접 정의 run 메서드가 실행
//        new Thread(new RunnableImplementsClass()).start();
//        //익명클래스로 생성
//        new Thread(() -> System.out.println("익명객체 스레드")).start();
        //쓰레드의 동시성 이슈 테스트
        //단일 스레드 일반호출
        for(int i = 0; i < 1000; i++) {
            Thread th = new Thread(()->Library.borrowBook());
            th.start();
            //join 메서드를 통해 먼저 생성된 다른 스레드의 완료전까지 새로운 스레드가 실행되지 않도록 막음
            //멀티스레드를 원천 차단한 거기 때문에 효용은 없다.
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
        System.out.println("최종 남은 수량 "+Library.bookcount);

    }
}
