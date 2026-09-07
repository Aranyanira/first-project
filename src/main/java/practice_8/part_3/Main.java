package practice_8.part_3;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----1----");
        //1. Поиск максимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 200, 32, 54, 199));
        Integer maxNumber = intList.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maxNumber);

        System.out.println("----2----");
        //2. Поиск минимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
        Integer minNumber = intList.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(minNumber);

        System.out.println("----3----");
        //3. Сумма всех элементов списка
        //Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
        Integer numberSum = intList.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(numberSum);

        System.out.println("----4----");
        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.
        List<String> authors = new ArrayList<>(Arrays.asList("Майер", "Булгаков", "Островский", "Бронте", "Чехов"));
        Optional firstBString = authors.stream()
                .filter(n -> n.startsWith("Б"))
                .findFirst();
        System.out.println(firstBString);

        System.out.println("----5----");
        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
        // который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
        Boolean containsEven = intList.stream()
                .anyMatch(i -> i % 2 == 0);
        System.out.println(containsEven);
    }
}
