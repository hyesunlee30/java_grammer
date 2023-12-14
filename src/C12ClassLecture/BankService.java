package C12ClassLecture;

public class BankService {
    public static void main(String[] args) {
        //은행계좌 실습
        //객체변수 계좌번호 accout_number 계좌번호, balance 잔고
        //계좌번호 setter, 잔고 setter
        //메서드 예금(deposit),인출(withdraw)
        // deposit에 잔액이 충분해야 인출
        // 잔액 얼마 남았는지 확인하는 메서드 만들어야함
        BankAccout accout = new BankAccout("홍길동예금", 0);
//        accout.setAccoutNumber("홍길동예금");
//        accout.setBalance(10);
        System.out.println(accout.checkBalance(accout.getAccoutNumber()));
        accout.deposit(10);
        accout.withdraw(30);
    }

}

class BankAccout {
    private String accoutNumber;
    private int balance;

    //기본 생성자 허용.
    BankAccout() {};
    //별도의 생성자가 없으면 깡통 기본 생성자가 숨어있다.
    //생성자란 클래스 객체화 될 때 자동으로 실행되는 메서드

    BankAccout (String accoutNumber, int balance) {
        this.accoutNumber = accoutNumber;
        this.balance = balance;
    }

//    void setAccoutNumber(String accoutNumber) {
//        this.accoutNumber = accoutNumber;
//    }
//
//    void setBalance(int balance) {
//        this.balance = balance;
//        System.out.println();
//    }
    String getAccoutNumber() {
        return this.accoutNumber;
    }
    int checkBalance(String accoutNumber) {
        if(this.accoutNumber.equals(accoutNumber)) {
            return balance;
        } else {
            System.out.println("계좌번호가 일치하지 않습니다.");
            return 0;
        }

    }

    //메서드 예금(deposit),인출(withdraw)
    // deposit에 잔액이 충분해야 인출
    // 잔액 얼마 남았는지 확인하는 메서드 만들어야함
    void deposit(int b) {
        this.balance += b;
        System.out.println(b+"원이 예금 되어 현재 잔액 "+balance+"원 입니다.");
    }
    void withdraw(int m) {
        int temp = this.balance - m;
        if(temp < 0) {
            System.out.println("잔액이 없어 "+m+"원을 인출할 수 없습니다.");
        } else {
            this.balance -= m;
            System.out.println(m+"원이 인출 되어 현재 잔액 "+balance+"원 입니다.");
        }

    }
}
