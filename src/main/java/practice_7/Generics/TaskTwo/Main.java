package practice_7.Generics.TaskTwo;

import java.util.ArrayList;

/*
2. Задача на дженерик метод
Условие задачи: Напишите дженерик метод printArray,
который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
 */
public class Main {
    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        String[] sweets = new String[]{"Мечта", "Сникерс", "РотФронт", "Шишкин лес"};
        arrayHandler.printArray(sweets);

        Integer[] numbers = new Integer[]{1, 2, 3, 4};
        arrayHandler.printArray(numbers);
    }
}
