import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Person1Test {
    CreditCard visa;
    CreditCard masterCard;
    CreditCard discoverCard;
    Wallet wallet;
    Person person1;

    @Before
    public void setUp() throws Exception {
        visa = new Visa(100);
        masterCard = new MasterCard(100);
        discoverCard = new Discover(100);
        Wallet wallet = new Wallet();
        wallet.addCard(visa);
        wallet.addCard(masterCard);
        wallet.addCard(discoverCard);
        person1 = new Person();
        person1.addWallet(wallet);
    }

    @Test
    public void testInterestMasterCard(){
        double result = masterCard.caculateInterest();
        assertEquals(5.0,result, 0);
    }


    @Test
    public void testInterestDiscover(){
        double result = discoverCard.caculateInterest();
        assertEquals(1,result, 0);
    }

    @Test
    public void testInterestVisa(){
        double result = visa.caculateInterest();
        assertEquals(10,result, 0);
    }

    @Test
    public void testPersonOneInterest(){
        double result = person1.caculateTotalInteresByWallet();
        assertEquals(16.0, result, 0);
    }


}