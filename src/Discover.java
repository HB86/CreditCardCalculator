public class Discover extends CreditCard {

    private double interest = .01;

    public Discover(int balance) {
        super(balance);
    }

    public double caculateInterest() {
        return interest * balance;
    }
}
