package C18Thread;

public class Library {
    static int bookcount = 100;
    //public static void borrowBook(){
    //syncronized키워드를 통해 해당 메서드(자원)에 한해서는 lock걸도록 설정
    public synchronized static void borrowBook(){
        if(bookcount>0){
            //책 빌리는 시간을 10밀리초로 가정.
            //온라인 책 대여 시스템
            //0보다는 크지만 밀리초 정도 걸림
            System.out.println("책을 빌리는 중입니다.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookcount-=1;
            System.out.println("대출완료");
            System.out.println("남아 있는 책수량 "+bookcount);
        } else {
            System.out.println("대출불가");
        }
    }
}
