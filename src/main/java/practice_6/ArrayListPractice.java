package practice_6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
         */
        System.out.println("-----Задача 1-----");
        ArrayList<Integer> intList = new ArrayList<>(List.of(100, 80, 34, 2, 1));
        intList.add(9);
        System.out.println(intList);

    /*
    Напишите программу, которая выводит все чётные числа из ArrayList.
     */
        System.out.println("-----Задача 2-----");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(19, 7, 8, 222, 5, 1));
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /*
        Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
         */
        System.out.println("-----Задача 3-----");
        ArrayList<String> colors = new ArrayList<>(List.of("Желтый", "Красный", "Маджента", "Серобуромалиновый", "Охра"));
        String longest = "";
        for (String color : colors) {
            if (color.length() > longest.length()) {
                longest = color;
            }
        }
        System.out.println(longest);

        /*
        Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
         */
        System.out.println("-----Задача 4-----");
        ArrayList<Integer> ints = new ArrayList<>(List.of(10, 9, 22, 8, 1, 5));
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println(sum);

    /*
    Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
     */
        System.out.println("-----Задача 5-----");
        ArrayList<Integer> intNumbers = new ArrayList<>(List.of(10, 900, 2200, 8, -10000, 5));
        System.out.println(findMax(intNumbers));
    }

    public static int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
