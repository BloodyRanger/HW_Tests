package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditAccountTests {
    CreditAccount sut;

    @BeforeEach
    public void init(){
        sut = new CreditAccount(-100);
    }

    @Test
    public void testAddMoneyTrue(){
        int a = 100;
        assertThat(sut.addMoney(a), is(true));
    }

    @Test
    public void testAddMoneyFalse(){
        int a = 200;
        assertThat(sut.addMoney(a), is(false));
    }

    @Test
    public void testPay(){
        int a = 10;
        int balance = sut.balance;
        int result = sut.pay(a);

        assertThat(result, lessThan(balance));
    }
    


}
