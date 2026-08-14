package practice_6;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        /*
        Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
         */
        System.out.println("-----Задача 1-----");
        LinkedHashMap<Integer, String> homeLibrary =  new LinkedHashMap<>();
        homeLibrary.put(19837, "Гордость и предубеждение");
        homeLibrary.put(194837, "Джейн Эйр");
        homeLibrary.put(192837, "Алая королева");
        homeLibrary.put(191837, "Киберзолушка");
        homeLibrary.put(1948537, "Жестокий принц");
        System.out.println(homeLibrary);

        /*
        Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
        Используй LinkedHashMap<String, String> где ключ — имя, значение — номер телефона
        Для добавления используй put(name, phone)
        Для поиска используй containsKey(name) и get(name)
        Имя можно передать в метод или считать с клавиатуры
        Если контакт найден — выведи номер телефона, иначе сообщение "Контакт не найден"
         */
        System.out.println("-----Задача 2-----");
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Настасья", "23243556");
        phoneBook.put("Алина", "23243356");
        phoneBook.put("Кирилл", "23224356");
        phoneBook.put("Василий", "23124356");
        phoneBook.put("Наталья", "23243156");
        phoneBook.put("Иван", "232411356");
        findNumber(phoneBook, "Алина");
        findNumber(phoneBook, "Ярослав");
        /*
        Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
        Используй LinkedHashMap<String, String> где ключ — идентификатор страницы, значение — её название
        Если размер мапы 10, а добавляется новый элемент - удаляй первый.
        Выводи историю с помощью entrySet(), порядок будет от самого старого к новому
         */
        System.out.println("-----Задача 3-----");
        LinkedHashMap<String, String> viewHistory =  new LinkedHashMap<>(10);
        addViewHistory(viewHistory,"1231", "Корзина");
        addViewHistory(viewHistory,"12231", "Меню");
        addViewHistory(viewHistory,"12131", "Товары");
        addViewHistory(viewHistory,"125531", "Брюки");
        addViewHistory(viewHistory,"12111131", "Платье");
        addViewHistory(viewHistory,"77", "Обувь");
        addViewHistory(viewHistory,"1231", "Корзина");
        addViewHistory(viewHistory,"444", "Обратная связь");
        addViewHistory(viewHistory,"6666", "Контакты");
        addViewHistory(viewHistory,"55321", "Доставка");
        addViewHistory(viewHistory,"85632", "Возврат");
        addViewHistory(viewHistory,"8999", "Аксессуары");
        addViewHistory(viewHistory,"123452", "Береты");
        addViewHistory(viewHistory, "99999", "Ноутбуки");
        System.out.println(viewHistory);

    }

    public static void addViewHistory(Map<String, String> viewHistory, String pageId, String pageName) {
        if (!viewHistory.containsKey(pageId)) {
            String oldestKey = viewHistory.entrySet().iterator().next().getKey();
            viewHistory.remove(oldestKey);
        }
        viewHistory.put(pageId, pageName);
    }

    public static void findNumber(Map<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Контакт найден. Номер телефона: " + phoneBook.get(name));
        } else {
            System.out.println("Контакт не найден.");
        }
    }
}
