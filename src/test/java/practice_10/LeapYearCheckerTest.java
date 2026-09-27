package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCheckerTest {
    //Тесты должны проверять:
    //Обычные годы
    //Високосные (2020, 2000, 1600)
    //Года, которые делятся на 100, но не на 400 (1900, 2100)

    LeapYearChecker checker = new LeapYearChecker();

    @ParameterizedTest
    @CsvSource({
            "2020", "2000", "1600", "1984"
    })
    void testIsLeapYearTrue(int year) {
        assertTrue(checker.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({
            "2023", "2001", "2026", "1500"
    })
    void testIsLeapYearFalse(int year) {
        assertFalse(checker.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({
            "1900", "2100"
    })
    void testIsLeapYearCornerCase(int year) {
        assertFalse(checker.isLeapYear(year));
    }

}