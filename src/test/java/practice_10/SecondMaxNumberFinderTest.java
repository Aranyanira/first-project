package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SecondMaxNumberFinderTest {
    //Тесты должны проверять:
    //Обычные массивы
    //Массив с одинаковыми числами
    //Один элемент в массиве (должно выбрасываться исключение)

    SecondMaxNumberFinder finder = new SecondMaxNumberFinder();

    public static Stream<Arguments> testDataSetUp() {
        return Stream.of(
                Arguments.of(new int[]{-1, -2, -100, -55}, -2),
                Arguments.of(new int[]{-1, -2, 100, 105}, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("testDataSetUp")
    void testFindSecondMaxNumberPositive(int[] array, int expectedResult) {
        assertEquals(expectedResult, finder.findSecondMax(array));
    }

    public static Stream<Arguments> testDataSetUpThrowsNoSuchElementException() {
        return Stream.of(
                Arguments.of(new int[]{10, 10, 10, 10, -55})
        );
    }

    @ParameterizedTest
    @MethodSource("testDataSetUpThrowsNoSuchElementException")
    void testFindSecondMaxNumberThrowsNoSuchElementException(int[] array) {
        assertThrows(NoSuchElementException.class, () -> finder.findSecondMax(array));
    }

    public static Stream<Arguments> testDataSetUpThrowsIllegalArgumentException() {
        return Stream.of(
                Arguments.of(new int[]{}),
                Arguments.of(new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("testDataSetUpThrowsIllegalArgumentException")
    void testFindSecondMaxNumberThrowsIllegalArgumentException(int[] array) {
        assertThrows(IllegalArgumentException.class, () -> finder.findSecondMax(array));
    }



}