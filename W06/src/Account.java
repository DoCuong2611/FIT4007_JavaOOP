public abstract class Account {

    private double balance;
    private String acc_id;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        else {
            return false;
        }
    }
    public void deposit(double money) {
        balance += money;
    }
}
