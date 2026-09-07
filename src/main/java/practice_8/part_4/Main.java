package practice_8.part_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("----1----");
        //1. Группировка строк по первой букве
        //Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
        List<String> authors = new ArrayList<>(Arrays.asList("Майер", "Булгаков", "Островский", "Бронте", "Чехов"));
        Map<String, List<String>> authorsMap = authors.stream()
                .collect(Collectors.groupingBy(author -> author.substring(0, 1)));
        System.out.println(authorsMap);

        System.out.println("----2----");
        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
        List<Integer> numbers = Arrays.asList(100, 12, 43, 47, 5);
        Map<Boolean, List<Integer>> evenMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println(evenMap);

        System.out.println("----3----");
        //3. Поиск среднего значения чисел
        //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.
        Double averageNumber = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(averageNumber);
    }
}
