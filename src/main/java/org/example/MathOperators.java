package org.example;

/*
Напишите класс MathOperations
Условие:
Создайте класс MathOperations с методами:
add(int x, int y) — возвращает сумму двух чисел
subtract(int x, int y) — разницу
multiply(int x, int y) — произведение
divide(int x, int y) — результат деления в double
В main вызовите каждый метод с произвольными числами и выведите результат.
*/

public class MathOperators {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(subtract(10, 2));
        System.out.println(multuply(9, 9));
        System.out.println(divide(100, 3));

        System.out.println(findMax(100, 101));
        System.out.println(difference(90, 12));

        System.out.println(squareArea(8));
        System.out.println(squarePerimeter(8));

        System.out.println(convertSecondsToMinutes(399));

        System.out.println(averageSpeed(60, 10));

        System.out.println(findHypotenuse(12, 0));
        System.out.println(findHypotenuse(-90, 2));

        System.out.println(circleCircumference(9));
        System.out.println(circleCircumference(0));
        System.out.println(circleCircumference(-10));

        System.out.println(calculatePercentage(100, 50) + "%");
        System.out.println(calculatePercentage(190, 5) + "%");

        System.out.println(fahrenheitToCelsius(100));
        System.out.println(celsiusToFahrenheit(100));

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multuply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    /*
    2. Реализуйте метод для нахождения максимума двух чисел
Условие:
Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
Вызовите метод в main и выведите результат.
     */
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    /*
    3. Метод для нахождения разницы между двумя числами
Условие:
Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
Проверьте метод в main.
     */
    //Сначала вычисляет, потом убирает -
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }
    /*
    4. Методы для площади и периметра квадрата
Условие:
Создайте два метода:
squareArea(int side) — возвращает площадь квадрата
squarePerimeter(int side) — возвращает периметр
Вызовите оба метода в main с примером.

     */

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    /*
    5. Метод для перевода секунд в минуты
Условие:
Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
Вызовите метод в main и выведите результат.
     */
    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    /* 6. Метод для вычисления средней скорости
Условие:
Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
Вызовите метод с разными значениями.
     */
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    /* 7. Метод для нахождения гипотенузы
Условие:
Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
√(a² + b²)
Вызовите метод с несколькими наборами чисел.
     */
    public static double findHypotenuse(double a, double b) {
        double result = Math.sqrt(a * a + b * b);
        return Math.abs(result);
    }

    /* 8. Метод для длины окружности
Условие:
Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
Проверьте работу на нескольких значениях.
     */
    public static double circleCircumference(double radius) {
        return 2* 3.14 * radius;
    }

    /* 9. Метод для вычисления процентов
Условие:
Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
Пример: 25 из 200 → 12.5%
     */
    public static double calculatePercentage(double total, double part) {
        return 100 * part / total;
    }

    /* 10. Методы перевода температуры
Условие:
Создайте два метода:
celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
Проверьте оба метода в main.
     */
    public static double celsiusToFahrenheit(double c) {
        return c * 9/5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}


/*
Напишите класс MathOperations
Условие:
Создайте класс MathOperations с методами:
add(int x, int y) — возвращает сумму двух чисел
subtract(int x, int y) — разницу
multiply(int x, int y) — произведение
divide(int x, int y) — результат деления в double
В main вызовите каждый метод с произвольными числами и выведите результат.
*/
    /*
    2. Реализуйте метод для нахождения максимума двух чисел
Условие:
Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
Вызовите метод в main и выведите результат.
     */


    /*
    3. Метод для нахождения разницы между двумя числами
Условие:
Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
Проверьте метод в main.
     */
//Сначала вычисляет, потом убирает -

    /*
    4. Методы для площади и периметра квадрата
Условие:
Создайте два метода:
squareArea(int side) — возвращает площадь квадрата
squarePerimeter(int side) — возвращает периметр
Вызовите оба метода в main с примером.

     */



    /*
    5. Метод для перевода секунд в минуты
Условие:
Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
Вызовите метод в main и выведите результат.
     */


    /* 6. Метод для вычисления средней скорости
Условие:
Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
Вызовите метод с разными значениями.
     */


    /* 7. Метод для нахождения гипотенузы
Условие:
Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
√(a² + b²)
Вызовите метод с несколькими наборами чисел.
     */


    /* 8. Метод для длины окружности
Условие:
Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
Проверьте работу на нескольких значениях.
     */


    /* 9. Метод для вычисления процентов
Условие:
Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
Пример: 25 из 200 → 12.5%
     */


    /* 10. Методы перевода температуры
Условие:
Создайте два метода:
celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
Проверьте оба метода в main.
     */


/*
 2. Реализуйте метод для нахождения максимума двух чисел
Условие:
Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
Вызовите метод в main и выведите результат.
  */


/*
3. Метод для нахождения разницы между двумя числами
Условие:
Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
Проверьте метод в main.
 */
//Сначала вычисляет, потом убирает -

    /*
    4. Методы для площади и периметра квадрата
Условие:
Создайте два метода:
squareArea(int side) — возвращает площадь квадрата
squarePerimeter(int side) — возвращает периметр
Вызовите оба метода в main с примером.

     */



/*
5. Метод для перевода секунд в минуты
Условие:
Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
Вызовите метод в main и выведите результат.
 */


/* 6. Метод для вычисления средней скорости
Условие:
Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
Вызовите метод с разными значениями.
 */


/* 7. Метод для нахождения гипотенузы
Условие:
Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
√(a² + b²)
Вызовите метод с несколькими наборами чисел.
 */


/* 8. Метод для длины окружности
Условие:
Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
Проверьте работу на нескольких значениях.
 */


/* 9. Метод для вычисления процентов
Условие:
Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
Пример: 25 из 200 → 12.5%
 */


/* 10. Методы перевода температуры
Условие:
Создайте два метода:
celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
Проверьте оба метода в main.
 */
