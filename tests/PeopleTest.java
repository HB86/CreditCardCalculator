import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    CreditCard visa;
    CreditCard masterCard;
    CreditCard discoverCard;
    Wallet wallet1;
    Wallet wallet2;
    Person person1;
    Person person2;

    @Before
    public void setUp() throws Exception {
        visa = new Visa(100);
        masterCard = new MasterCard(100);
        discoverCard = new Discover(100);
        wallet1 = new Wallet();
        wallet2 = new Wallet();
        person1 = new Person();
        person2 = new Person();
        wallet1.addCard(masterCard);
        wallet1.addCard(visa);
        wallet2.addCard(masterCard);
        wallet2.addCard(visa);
        person1.addWallet(wallet1);
        person2.addWallet(wallet2);
    }

    @Test
    public void testWalletforPerson1(){
        double result = wallet1.caculateTotalInterestForCards();
        assertEquals(15, result, 0);
    }

    @Test
    public void testWalletforPerson2(){
        double result = wallet2.caculateTotalInterestForCards();
        assertEquals(15, result, 0);
    }

    @Test
    public void testPerson1Interest(){
        double result = person1.caculateTotalInteresByWallet();
        assertEquals(15, result, 0);
    }
    @Test
    public void testPerson2Interest(){
        double result = person2.caculateTotalInteresByWallet();
        assertEquals(15, result, 0);
    }

}
