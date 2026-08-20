package practice_7.Generics.TaskThree;
/*
3. Задача на дженерик с двумя типами данных
Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
Класс должен позволять получать и устанавливать каждый из этих объектов.
 */
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("Василиса", 20);
        System.out.println("Имя: " + person.getFirstValue() + ", возраст: " + person.getSecondValue());
        person.setFirstValue("Василина");
        System.out.println("Имя: " + person.getFirstValue() + ", возраст: " + person.getSecondValue());

        Pair<String, String> dessert = new Pair<>("Птичье молоко", "Нежное суфле в молочном шоколаде");
        System.out.println("Название: " + dessert.getFirstValue() + ", описание: " + dessert.getSecondValue());
        dessert.setSecondValue("Нежное суфле в горьком шоколаде");
        System.out.println("Название: " + dessert.getFirstValue() + ", описание: " + dessert.getSecondValue());
    }
}
