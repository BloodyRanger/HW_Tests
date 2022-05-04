package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingAccountTests {
    CheckingAccount sut;

    @BeforeEach
    public void init(){
        sut = new CheckingAccount(100);
    }

    @Test
    public void testPay(){
        int a = 10, expected = 90;

        int result = sut.pay(a);

        assertEquals(result, expected);
    }

    @Test
    public void testAddMoney(){
        int a = 10;

        assertTrue(sut.addMoney(a));
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testPay(int a, int expected){
        int result = sut.pay(a);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> source(){
        return Stream.of(Arguments.of(10, 90), Arguments.of(50, 50), Arguments.of(200, 100), Arguments.of(1000, 100));
    }
}
