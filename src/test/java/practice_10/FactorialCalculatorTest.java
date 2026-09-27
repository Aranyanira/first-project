package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    //Тесты должны проверять:
    //0! = 1
    //Маленькие числа (1!, 5!, 7!)
    //Отрицательные числа (должно выбрасываться исключение)

    FactorialCalculator fCalculator = new FactorialCalculator();

    public static Stream<Arguments> testFactorialPositiveData() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040),
                Arguments.of(0, 1)

        );
    }

    @ParameterizedTest
    @MethodSource("testFactorialPositiveData")
    void testFactorialPositive(int n, int expected) {
        assertEquals(expected, fCalculator.factorial(n));
    }

    @ParameterizedTest
    @CsvSource({
            "-1", "-100", "-52"
    })
    void testFatorialCalculatorThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> fCalculator.factorial(n));
    }
}