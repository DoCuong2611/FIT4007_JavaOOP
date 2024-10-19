public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;
    public static final double OVERDRAFT_FEE = 0.02;

    public  BankAccount() {
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void showInfo() {
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft fee: " + OVERDRAFT_FEE);
    }
}
