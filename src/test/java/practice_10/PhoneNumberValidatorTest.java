package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidatorTest {
    //Тесты должны проверять:
    //Корректные номера ("+1 1234567890")
    //Некорректные номера ("12345", "invalid")

    PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();

    @ParameterizedTest
    @CsvSource({
            "+1 1234567890", "+7 9129878967"
    })
    void testPhoneNumberValidatorTrueResult(String phoneNumber) {
        assertTrue(phoneNumberValidator.isValidPhoneNumber(phoneNumber));
    }

    @ParameterizedTest
    @CsvSource({
            "12345", "+79129878967", "invalid"
    })
    void testPhoneNumberValidatorFalseResult(String phoneNumber) {
        assertFalse(phoneNumberValidator.isValidPhoneNumber(phoneNumber));
    }

}