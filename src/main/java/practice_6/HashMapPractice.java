package practice_6;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        /*
        Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
         */
        System.out.println("-----Задача 1-----");
        HashMap<String, Integer> data = new HashMap<>();
        data.put("Наталья", 17);
        data.put("Василий", 90);
        data.put("Ирина", 45);
        data.put("Иван", 80);
        data.put("Арина", 17);
        data.put("Арина", 11);
        System.out.println(data);

    /*
    Проверьте, есть ли определённое имя в HashMap.
    Используй метод containsKey("Имя")
    Имя можно задать вручную или получить через Scanner
    Если имя найдено — выведи возраст или сообщение "Найдено"
    Если не найдено — выведи "Не найдено"
     */
        System.out.println("-----Задача 2-----");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Наталья", 17);
        map.put("Василий", 90);
        map.put("Ирина", 45);
        map.put("Иван", 80);
        map.put("Арина", 17);
        map.put("Арина", 11);
        checkIfContainsName(map, "Василий");
        checkIfContainsName(map, "Алексей");

        /*
        Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        Создай метод с сигнатурой void printUnderage(Map<String, Integer> map)
        Пройдись по элементам с помощью for (Map.Entry<String, Integer> entry : map.entrySet())
        Внутри цикла проверь entry.getValue() < 18
        Если условие выполняется — выведи имя и возраст
         */
        System.out.println("-----Задача 3-----");
        printUnderage(map);



    }

    public static void printUnderage(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry);
            }
        }
    }

    public static void checkIfContainsName(HashMap<String,Integer> map, String name){
        if(map.containsKey(name)){
            System.out.println("Имя " + name + " найдено. Возраст: " + map.get(name) );
        } else {
            System.out.println("Имя не найдено.");
        }
    }
}
