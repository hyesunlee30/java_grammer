package C14Interface.BankService;

public class BankKapayService implements BankService{
    @Override
    public void deposit(BankAccount account, int b) {
        account.setBalance(account.getBalance()+b);
        System.out.println("BankKpay로 "+b+"원이 예금 되어 현재 잔액 "+account.getBalance()+"원 입니다.");
    }

    @Override
    public void withdraw(BankAccount account, int m) {
        int temp = account.getBalance() - m;
        if(temp < 0) {
            System.out.println("잔액이 없어 "+m+"원을 인출할 수 없습니다.");
        } else {
            account.setBalance(temp);
            System.out.println("BankKpay로 "+m+"원이 인출 되어 현재 잔액 "+account.getBalance()+"원 입니다.");
        }
    }


}
