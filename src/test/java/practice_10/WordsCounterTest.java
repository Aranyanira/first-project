package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordsCounterTest {
    //Тесты должны проверять:
    //Пустую строку
    //null
    //Строку с несколькими пробелами

    WordsCounter wordsCounter = new WordsCounter();

    public static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("Многофункциональный крем для лица применяется для увлажнения", 7)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testWordsCount(String sentence, int expectedCount) {
        assertEquals(expectedCount, wordsCounter.countWords(sentence));
    }

    @Test
    void testWordsCountIfEmpty() {
        assertThrows(NullPointerException.class, () ->  wordsCounter.countWords(null));
    }
}