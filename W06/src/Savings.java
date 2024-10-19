public class Savings extends Account {
    private double intRate;
    private double intAmount;

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
