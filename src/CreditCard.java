public abstract class CreditCard {

protected int balance;
protected int interest;

public CreditCard(int balance){
this.balance = balance;
}

    public abstract double caculateInterest();

}
