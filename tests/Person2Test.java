import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class Person2Test {
    CreditCard visa;
    CreditCard masterCard;
    CreditCard discoverCard;
    Wallet wallet1;
    Wallet wallet2;
    Person person2;

    @Before
    public void setUp() throws Exception{
        visa = new Visa(100);
        masterCard = new MasterCard(100);
        discoverCard = new Discover(100);
        wallet1 = new Wallet();
        wallet2 = new Wallet();
        wallet1.addCard(visa);
        wallet2.addCard(masterCard);
        wallet1.addCard(discoverCard);
        person2 = new Person();
        person2.addWallet(wallet1);
        person2.addWallet(wallet2);
    }

    @Test
    public void testWallet1Interest(){
        double result = wallet1.caculateTotalInterestForCards();
        assertEquals(11, result, 0);
    }

    @Test
    public void testWallet2Interest(){
        double result = wallet2.caculateTotalInterestForCards();
        assertEquals(5, result, 0);
    }

    @Test
    public void testPerson2Interest(){
        double result = person2.caculateTotalInteresByWallet();
        assertEquals(16.0, result, 0);
    }

}
