package C14Interface.BankService;


import java.util.Scanner;


public class BankController {

    public static void main(String[] args) {

        BankService service = new BankCardService();
        BankService service2 = new BankKapayService();
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력해주세요.");
        String number = sc.next();
        BankAccount account = new BankAccount(number, 1000);

        while (true) {
            System.out.println("SW캠프 은행 금융서비스입니다.");
            System.out.println("어떤 서비스를 실행하시겠습니까? 1: 예금, 2: 인출");
            String a = sc.next();
            if(a.equals("1")) {
                //예금
                System.out.println("어떤 서비스로 입금하시겠습니까? 1: kpay, 2: card");
                String type = sc.next();
                System.out.println("얼마를 입금하시겠습니까?");
                int money = sc.nextInt();
                if(type.equals("1")) {
                    service2.deposit(account, money);
                } else {
                    service.deposit(account, money);
                }
            } else {
                //인출
                System.out.println("어떤 서비스로 출금하시겠습니까? 1: kpay, 2: card");
                String wi = sc.next();
                System.out.println("얼마를 출금하시겠습니까?");
                int money = sc.nextInt();
                if(wi.equals("1")) {
                    service2.withdraw(account, money);
                } else {
                    service.withdraw(account, money);
                }
            }
            System.out.println("서비스를 종료하시겠습니까? 0: 종료, 1: 계속");
            String io = sc.next();
            if(io.equals("0")) {
                return;
            }
        }
    }


}
