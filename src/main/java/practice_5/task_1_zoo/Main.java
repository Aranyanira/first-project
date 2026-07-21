package practice_5.task_1_zoo;

/*
Условие:
В зоопарке есть одно животное, но оно может быть разным: птица или слон.
Каждое животное издаёт уникальные звуки и передвигается по-своему.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать с любым животным, добавлять его в зоопарк и демонстрировать его поведение.
 */

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("Моська");
        Animal bird = new Bird("Кеша");

        Zoo zoo = new Zoo();

        zoo.present(elephant);
        zoo.demonstrate(elephant);
        zoo.present(bird);
        zoo.demonstrate(bird);
    }
}
