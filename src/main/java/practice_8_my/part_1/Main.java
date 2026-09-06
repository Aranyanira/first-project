package practice_8_my.part_1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        MathOperation sum = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        /*System.out.println(sum.operation(5, 5));
        System.out.println(subtract.operation(5, 5));
        System.out.println(mul.operation(5, 5));
        System.out.println(div.operation(5, 5));*/

        // Задача 2
        /*
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r.run();
         */

        // Задача 3.
        /*
        Predicate<Integer> isEven = (a) -> a % 2 == 0;

        System.out.println(isEven.test(2));

         */

        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

        Function<String, Integer> returnLength = (a) -> a.length();
        System.out.println(returnLength.apply(" Съешь еще этих француских булок, да выпей чаю."));

        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> printString = System.out::println;
        printString.accept("Любовь должна быть трагедией. Величайшей тайной в мире! " +
                "Никакие жизненные удобства, расчеты и компромиссы не должны ее касаться.");


    }
}
