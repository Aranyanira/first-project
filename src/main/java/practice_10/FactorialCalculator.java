package practice_10;

public class FactorialCalculator {
    //7. Факториал числа
    //Напишите тесты для метода, который вычисляет факториал числа:
    //
    //public int factorial(int n) {
    //    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    //    return (n == 0) ? 1 : n * factorial(n - 1);
    //}
    //Тесты должны проверять:
    //0! = 1
    //Маленькие числа (1!, 5!, 7!)
    //Отрицательные числа (должно выбрасываться исключение)

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
