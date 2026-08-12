package practice_6;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        /*
        Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
         */
        System.out.println("-----Задача 1-----");
        PriorityQueue<Integer> ints = new PriorityQueue<>();
        ints.offer(90);
        ints.add(1221);
        ints.offer(167);
        ints.add(874);
        ints.add(345);
        while (!ints.isEmpty()) {
            System.out.println(ints.poll());
        }
    }
}
