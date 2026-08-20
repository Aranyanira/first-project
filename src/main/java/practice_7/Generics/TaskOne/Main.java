package practice_7.Generics.TaskOne;
/*
1. Задача на дженерик класс
Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
 */
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setT("Штаны");
        System.out.println(stringBox.getT());

        Box<Integer> integerBox = new Box<>();
        integerBox.setT(100);
        System.out.println(integerBox.getT());
    }
}
