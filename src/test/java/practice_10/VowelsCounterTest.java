package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VowelsCounterTest {
    //Тесты должны проверять:
    //Разные строки ("hello", "java", "AEIOU", "")
    //null (должно выбрасываться исключение)
    //Строки без гласных

    VowelsCounter vowelsCounter = new VowelsCounter();

    public static Stream<Arguments> testVowelsCounterData() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("StRNG", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testVowelsCounterData")
    public void testVowelsCounterPositive(String input, int expectedCount) {
        assertEquals(expectedCount, vowelsCounter.countVowels(input));
    }

    @Test
    public void testVowelsCounterThrowsException () {
        assertThrows(IllegalArgumentException.class, () -> vowelsCounter.countVowels(null));
    }

}