import java.util.List;

public class Wallet {

    private List<CreditCard> creditCards;

    private double totalInterest;

    public Wallet() {
        this.creditCards = CreditCardsFactory.getWalletsList();
    }

    public void addCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }

    public double caculateTotalInterestForCards() {
        for (CreditCard card : creditCards) {
            totalInterest += card.caculateInterest();
        }

        return totalInterest;
    }

}
