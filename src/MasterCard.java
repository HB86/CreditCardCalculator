public class MasterCard extends CreditCard {

    private double interest = .05;

    public MasterCard(int balance) {
        super(balance);
    }

    public double caculateInterest() {
        return interest * balance;
    }
}
