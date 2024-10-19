import java.security.DigestException;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        BankAccount account5 = new BankAccount();

        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());
        System.out.println(account3.getAccountNumber());
        System.out.println(account4.getAccountNumber());
        System.out.println(account5.getAccountNumber());
        System.out.println(BankAccount.OVERDRAFT_FEE);
    }
}
