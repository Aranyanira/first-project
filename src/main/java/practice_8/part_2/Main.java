package practice_8.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
        List<String> strings = new ArrayList<>(Arrays.asList("Торт", "Бисквит", "Вафли", "Конфеты", "Чизкейк"));
        List<String> filteredString = strings.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filteredString);

        System.out.println("----2----");
        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу, которая принимает список чисел и отбирает только те,
        // которые делятся на 5 без остатка, используя Stream API.
        List<Integer> integers = Arrays.asList(10, 9, 11, 100, 2, 25);
        List<Integer> filteredIntegers = integers.stream()
                .filter(i -> i % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredIntegers);

        System.out.println("----3----");
        //3. Преобразование строк в их длины
        //Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
        List<String> bonbons = new ArrayList<>(Arrays.asList("Метелица", "РотФронт", "Мишка на севере", "Мечта"));
        List<Integer> bonbonsToLength = bonbons.stream()
                .map(i -> i.length())
                .collect(Collectors.toList());
        System.out.println(bonbonsToLength);

        System.out.println("----4----");
        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
        // где каждое число заменено на его квадрат, используя Stream API.

        List<Integer> numbers = Arrays.asList(2, 5, 10, 3, 90);
        List<Integer> numbersSquared = numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(numbersSquared);

        System.out.println("----5----");
        //5. Удаление дубликатов из списка
        //Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
        List<String> colors = Arrays.asList("Зеленый", "Красный", "Желтый", "Зеленый", "Фиолетовый", "Лиловый", "Фиолетовый");
        List<String> uniqueColors = colors.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueColors);

    }
}
