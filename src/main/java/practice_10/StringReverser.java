package practice_10;

public class StringReverser {
    //3. Разворот строки
    //Напишите тесты для метода, который переворачивает строку:
    //
    //public String reverse(String input) {
    //    if (input == null) return null;
    //    return new StringBuilder(input).reverse().toString();
    //}
    //
    //Тесты должны проверять:
    //Обычные строки
    //Пустую строку
    //null (должно возвращаться null)

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
