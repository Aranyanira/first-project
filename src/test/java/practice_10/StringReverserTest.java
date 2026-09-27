package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    //Тесты должны проверять:
    //Обычные строки
    //Пустую строку
    //null (должно возвращаться null)

    StringReverser stringReverser = new StringReverser();

    public static Stream<Arguments> testStringReverserData () {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("anna", "anna"),
                Arguments.of("miracle", "elcarim"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("testStringReverserData")
    void testStringReverserPositive (String input, String expected) {
        assertEquals(expected, stringReverser.reverse(input));
    }

    @Test
    void testStringReverserWithNull () {
        assertEquals(null, stringReverser.reverse(null));
    }
}