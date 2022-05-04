package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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
        assertTrue(sut.addMoney(a));
    }

    @Test
    public void testAddMoneyFalse(){
        int a = 200;
        assertFalse(sut.addMoney(a));
    }

}
