package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SavingsAccountTests {
    SavingsAccount sut;

    @BeforeEach
    public void init(){
        sut = new SavingsAccount(100);
    }


    @Test
    public void testPay(){
        int a = 10;
        int result = sut.pay(a);

        assertThat(result, notNullValue());
    }
}
