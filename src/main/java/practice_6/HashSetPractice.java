package practice_6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        Создайте HashSet из 5 чисел и выведите его содержимое.
//         */
        System.out.println("-----Задача 1-----");
        HashSet<Integer> numbers = new HashSet<>(List.of(100, 80, 34, 2, 1));
        System.out.println(numbers);

        /*
        Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
         */
        System.out.println("-----Задача 2-----");
        HashSet<Integer> nums = new HashSet<>();
        nums.add(4);
        nums.add(5);
        nums.add(100);
        nums.add(12);
        nums.add(899);
        nums.add(122);
        nums.add(12);
        nums.add(45);
        nums.add(123);
        nums.add(56);
        nums.add(10);
        checkIfSetContains(nums, 9);
        checkIfSetContains(nums, 123);


    /*
    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
     */
        System.out.println("-----Задача 3-----");
        LinkedList<String> sweets = new LinkedList<>();
        sweets.add("Пьяная вишня");
        sweets.add("Метелица");
        sweets.add("РотФронт");
        sweets.add("Шоколад Воздушный");
        sweets.add("РотФронт");
        sweets.add("Сникерс");
        System.out.println(sweets);
        System.out.println("----А теперь через Set:----");
        System.out.println(returnSet(sweets));

        /*
        Создайте HashSet, содержащий набор имен.
        Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
         */
        System.out.println("-----Задача 4-----");
        HashSet<String> names = new HashSet<>(List.of("Валя", "Вика", "Всеволод", "Кристина", "Ксения"));
        checkIfSetContainsName(names, "Кристина");
        checkIfSetContainsName(names, "Никита");

    }

    public static void checkIfSetContains(Set<Integer> set, int value) {
        if (set.contains(value)) {
            System.out.println("Значение " + value + " есть в списке");
        } else {
            System.out.println("Значение " + value + " не в списке");
        }
    }

    public static Set<String> returnSet(List<String> list) {
        return new HashSet<>(list);
    }

    public static void checkIfSetContainsName(Set<String> set, String name) {
        if (set.contains(name)) {
            System.out.println("Имя " + name + " есть в списке");
        } else {
            System.out.println("Имя " + name + " не в списке");
        }
    }

}
