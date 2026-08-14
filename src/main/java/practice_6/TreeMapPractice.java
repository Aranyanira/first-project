package practice_6;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        /*
        Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

         */
        System.out.println("-----Задача 1-----");
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Василий", 90);
        scores.put("Александра", 100);
        scores.put("Женя", 1);
        scores.put("Виктория", 45);
        scores.put("Алена", 78);
        System.out.println(scores);
        System.out.println("Или так: ");
        for (String key : scores.keySet()) {
            System.out.println((key + " = " + scores.get(key)));
        }

        /*
        Найдите минимальный и максимальный ключ в TreeMap.
         */
        System.out.println("-----Задача 2-----");
        TreeMap<Integer, String> studentList = new TreeMap<>();
        studentList.put(90, "Василий");
        studentList.put(100, "Александра");
        studentList.put(1, "Женя");
        studentList.put(45, "Виктория");
        studentList.put(78, "Алена");
        System.out.println(studentList.firstKey());
        System.out.println(studentList.lastKey());


        /*
        Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
         */
        System.out.println("-----Задача 3-----");
        TreeMap<Integer, String> workers = new TreeMap<>();
        workers.put(9089, "Василий");
        workers.put(1009, "Александра");
        workers.put(1421, "Женя");
        workers.put(4567, "Виктория");
        workers.put(7811, "Алена");
        System.out.println(workers.higherKey(8909));
        System.out.println(workers.lowerKey(8909));
    }

}

