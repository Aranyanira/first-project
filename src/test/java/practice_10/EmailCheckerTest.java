package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailCheckerTest {

    //Тесты должны проверять:
    //Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    //null

    EmailChecker checker = new EmailChecker();

    @ParameterizedTest
    @CsvSource({
            "test@example.com", "a9djkdy@gmail.kzu"
    })
    void testValidEmailValues(String email) {
        assertTrue(checker.isValidEmail(email));
    }

    @ParameterizedTest
    @CsvSource({
            "bad@.com", "no-at-symbol"
    })
    void testInvalidEmailValues(String email) {
        assertFalse(checker.isValidEmail(email));
    }

    @Test
    void testEmailWithNullValue() {
        assertFalse(checker.isValidEmail(null));
    }

}