import java.util.List;

public class Person {

    private double interestByPerson;

    private List<Wallet> wallets;

    public Person() {
        this.wallets = WalletsFactory.getWalletsList();
    }

    public void addWallet(Wallet wallet) {
        wallets.add(wallet);
    }

    public double caculateTotalInteresByWallet() {
        for (Wallet wallet : wallets) {
            interestByPerson += wallet.caculateTotalInterestForCards();
        }

        return interestByPerson;
    }

}
