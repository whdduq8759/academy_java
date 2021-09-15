package day18.exception;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    //출금 기능
    public void withDraw(int money) throws Exception {
        if(balance < money) {
            //throw: 발생하다
            throw new BalanceInsufficientException("잔액 부족!");
        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
