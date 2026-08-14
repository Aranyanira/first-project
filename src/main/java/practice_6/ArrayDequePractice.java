package practice_6;

import java.util.ArrayDeque;

public class ArrayDequePractice {
    public static void main(String[] args) {

        /*
        Создайте ArrayDeque, добавьте 5 элементов и выведите их.

         */
        System.out.println("-----Задача 1-----");
        ArrayDeque<String> names = new ArrayDeque<>();
        names.offer("Светлана");
        names.offer("Виктория");
        names.offer("Никита");
        names.offer("Олеся");
        names.offer("Егор");
        for(String name : names) {
            System.out.println(name);
        }

        /*
        Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
         */
        System.out.println("-----Задача 2-----");

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(890);
        deque.push(11);
        deque.push(8950);
        deque.push(5);
        deque.push(78);
        System.out.println(deque);
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }

        System.out.println("-----Задача 3-----");
        /*
        Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
         */
        ArrayDeque<String> sweets = new ArrayDeque<>();
        sweets.offer("Конфеты");
        sweets.offer("Орехи");
        sweets.offer("Шоколад");
        sweets.offerFirst("Торты");
        sweets.offerLast("Желе");
        sweets.offer("Фрукты");
        System.out.println(sweets);
        System.out.println(sweets.pollFirst());
        System.out.println(sweets.pollLast());



    }
}
