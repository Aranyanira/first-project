package practice_10;

public class VowelsCounter {
    //2. Подсчёт количества гласных в строке
    //Напишите тесты для метода, который считает количество гласных букв в строке:
    //
    //public int countVowels(String input) {
    //    if (input == null) {
    //        throw new IllegalArgumentException("Input cannot be null");
    //    }
    //    return (int) input.toLowerCase().chars()
    //            .filter(c -> "aeiou".indexOf(c) != -1)
    //            .count();
    //}
    //
    //Тесты должны проверять:
    //Разные строки ("hello", "java", "AEIOU", "")
    //null (должно выбрасываться исключение)
    //Строки без гласных

    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
