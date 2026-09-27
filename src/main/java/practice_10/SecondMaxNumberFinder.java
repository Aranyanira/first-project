package practice_10;

import java.util.Arrays;

public class SecondMaxNumberFinder {
    //8. Поиск второго максимального числа в массиве
    //Напишите тесты для метода, который находит второе по величине число:
    //
    //public int findSecondMax(int[] numbers) {
    //    return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    //}
    //
    //Тесты должны проверять:
    //Обычные массивы
    //Массив с одинаковыми числами
    //Один элемент в массиве (должно выбрасываться исключение)

    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}
