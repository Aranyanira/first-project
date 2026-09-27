package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IsEvenCheckerTest {
    //Тесты должны проверять:
    //Чётные и нечётные числа
    //Нулевое значение
    //Отрицательные числа

    IsEvenChecker checker = new IsEvenChecker();

    @ParameterizedTest
    @CsvSource({
            "10", "100", "298",
            "0",
            "-12", "-300"
    })
    void testIsEvenCheckerWithEvenNumbers(int number) {
        assertTrue(checker.isEven(number));
    }

    @ParameterizedTest
    @CsvSource({
            "97", "1965", "301",
            "-97", "-211"
    })
    void testIsEvenCheckerWithUnevenNumbers(int number) {
        assertFalse(checker.isEven(number));
    }

}