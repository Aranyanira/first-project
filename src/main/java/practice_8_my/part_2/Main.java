package practice_8_my.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу, которая принимает список строк и удаляет из него
        // все строки длиной 5 символов и менее, используя Stream API.

        List<String> strings = new ArrayList<>(Arrays.asList("Пончик", "Конфета", "Эстерхази", "Чокопай", "Медовик", "Смузи", "Тост"));
        List<String> filteredStrings = strings.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);

        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу,
        // которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.

        List<Integer> numbers = Arrays.asList(100, 90, 11, 13, 5, 19, 20);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);

        //3. Преобразование строк в их длины
        //Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.

        List<String> bonbons = new ArrayList<>(Arrays.asList("РотФронт", "Пчелка", "Метелица", "Рафаэлло", "Мишка на севере"));
        List<Integer> bonbonLength = bonbons.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(bonbonLength);

        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
        // где каждое число заменено на его квадрат, используя Stream API.

        List<Integer> intList = new ArrayList<>(Arrays.asList(2, 5, 10, 11, 3, 9));
        List<Integer> numberSquare = intList.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        System.out.println(numberSquare);

        //5. Удаление дубликатов из списка
        //Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
        List<String> colors = new ArrayList<>(Arrays.asList("Желтый", "Красный", "Зеленый", "Желтый", "Синий", "Синий"));
        List<String> uniqueColors = colors.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueColors);

    }
}
