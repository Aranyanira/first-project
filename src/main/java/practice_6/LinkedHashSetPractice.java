package practice_6;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

    /*
    Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
     */
        System.out.println("-----Задача 1-----");
        LinkedHashSet<String> songs = new LinkedHashSet<>();
        songs.add("West coast");
        songs.add("Sunshine");
        songs.add("Sunshine");
        songs.add("Secrets");
        songs.add("Everybody loves me");
        songs.add("I Ain't Worried");
        System.out.println(songs);

        /*
        Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
         */
        System.out.println("-----Задача 2-----");
        LinkedHashSet<String> songsAgain = new LinkedHashSet<>();
        addElement(songsAgain, "West coast");
        addElement(songsAgain, "Sunshine");
        System.out.println(songsAgain);
        addElement(songsAgain, "Sunshine");
        System.out.println(songsAgain);

    }

    public static void addElement(LinkedHashSet<String> list, String element) {
        list.add(element);
    }
}
