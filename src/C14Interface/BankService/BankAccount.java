package C14Interface.BankService;

public class BankAccount {
    private String accoutNumber;
    private int balance;

    BankAccount(String accoutNumber, int balance) {
        this.accoutNumber = accoutNumber;
        this.balance = balance;
    }

    public String getAccoutNumber() {
        return accoutNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
