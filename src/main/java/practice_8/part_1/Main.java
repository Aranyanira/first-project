package practice_8.part_1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //1. Создайте свой функциональный интерфейс
        //Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
        // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
        MathOperation sum = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(sum.operation(5, 5));
        System.out.println(subtract.operation(5, 5));
        System.out.println(mul.operation(5, 5));
        System.out.println(divide.operation(5, 5));

        System.out.println("-----2----");

        //2. Использование анонимного класса
        //Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r.run();

        System.out.println("-----3----");
        //3. Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.
        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(5));

        System.out.println("-----4----");
        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
        Function<String, Integer> stringLength = (a) -> a.length();
        System.out.println(stringLength.apply("Съешь еще этих мягких французских булок, да выпей чаю"));

        System.out.println("-----5----");
        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> printString = (a) -> System.out.println(a);
        Consumer<String> printString2 = System.out::println;
        printString.accept("Конфеты");
        printString2.accept("Торты");

    }
}
