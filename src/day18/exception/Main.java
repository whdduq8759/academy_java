package day18.exception;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000);

        try {
            acc.withDraw(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("잔액: " + acc.getBalance());
        System.out.println("program exit");
    }
}
