package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000000);
        account.deposit(30000);
        System.out.println("balance = " + account.getBalance());

    }
}
