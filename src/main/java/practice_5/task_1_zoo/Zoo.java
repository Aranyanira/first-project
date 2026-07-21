package practice_5.task_1_zoo;

public class Zoo {
    public void demonstrate(Animal animal) {
        animal.makeSound();
        animal.move();
    }

    //Реализовано без списков, поэтому метод имитирует добавление Animal
    public void present(Animal animal) {
        System.out.println("В зоопарк приехал " + animal.getName());
    }
}
