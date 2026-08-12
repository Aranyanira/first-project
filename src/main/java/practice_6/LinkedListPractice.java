package practice_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
    /*
    Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
     */
        System.out.println("-----Задача 1-----");
        LinkedList<String> sweets = new LinkedList<>();
        sweets.add("Пьяная вишня");
        sweets.add("Метелица");
        sweets.add("РотФронт");
        sweets.add("Шоколад Воздушный");
        sweets.add("Сникерс");
        System.out.println(sweets);

        /*
        Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
         */
        System.out.println("-----Задача 2-----");
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Сходить в магазин");
        tasks.add("Купить штаны для йоги");
        tasks.add("Вынести мусор");
        System.out.println("Выполнение задач в порядке поступления:");
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());

        /*
        Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
         */
        System.out.println("-----Задача 3-----");
        LinkedList<String> stationary = new LinkedList<>(List.of("Ручка", "Тетрадь", "Дневник", "Линейка", "Циркуль"));
        System.out.println(stationary.getFirst());
        System.out.println(stationary.getLast());

        /*
        Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
         */
        System.out.println("-----Задача 4-----");
        List<Integer> numbers = new ArrayList<>(List.of(89, 11, 789, 34, 1, 1));
        System.out.println(calculateSum(numbers));

        /*
        Используйте ListIterator для прохода по LinkedList в обоих направлениях.
         */
        System.out.println("-----Задача 5-----");
        LinkedList<String> booksToRead = new LinkedList<>(List.of("Мятежная королева", "Жестокий принц", "Доверие", "Алая королева"));
        ListIterator<String> interator = booksToRead.listIterator();
        System.out.println("Проход с начала: ");
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
        System.out.println("Проход с конца: ");
        while(interator.hasPrevious()) {
            System.out.println(interator.previous());
        }

    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
