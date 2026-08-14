package practice_6;

import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
        /*
    Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
     */
        System.out.println("-----Задача 1-----");
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(5);
        myTreeSet.add(10);
        myTreeSet.add(1);
        myTreeSet.add(190);
        myTreeSet.add(6);
        System.out.println(myTreeSet);

        /*
        Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
         */
        System.out.println("-----Задача 2-----");
        TreeSet<Integer> ints = new TreeSet<>();
        ints.add(190);
        ints.add(6);
        ints.add(190);
        System.out.println(ints);

        /*
        Найдите ближайшее большее и меньшее число к заданному в TreeSet.
         */
        System.out.println("-----Задача 3-----");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(190);
        numbers.add(6);
        System.out.println(numbers.lower(10));
        System.out.println(numbers.higher(10));
    }

}
