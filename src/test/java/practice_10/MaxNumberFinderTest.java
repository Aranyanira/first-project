package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {
    //Тесты должны проверять:
    //Обычный массив ([3, 5, 7, 2])
    //Один элемент в массиве
    //Отрицательные числа
    //Пустой массив (должно выбрасываться исключение)

    MaxNumberFinder finder = new MaxNumberFinder();

    public static Stream<Arguments> arraySetData () {
        return Stream.of(
                Arguments.of(new int[]{-1, -18, 0, 90, 33, 15}, 90),
                Arguments.of(new int[]{0, 10, 4, 5, 10, 9}, 10),
                Arguments.of(new int[]{-100}, -100)
        );
    }

    @ParameterizedTest
    @MethodSource("arraySetData")
    void testMaxNumberFinderPositive(int[] array, int expectedValue) {
        assertEquals(expectedValue, finder.findMax(array));
    }

    @Test
    void testMaxNumberFinderWithEmptyArray () {
        assertThrows(NoSuchElementException.class, () -> finder.findMax(new int[]{}));
    }
}