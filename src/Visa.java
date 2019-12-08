public class Visa extends CreditCard {

    private double interest = .1;

    public Visa(int balance) {
        super(balance);
    }

    public double caculateInterest() {
        return interest * balance;
    }
}
