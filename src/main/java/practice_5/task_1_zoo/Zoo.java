package practice_5.task_1_zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + animal.getName() + " добавлено!");
    }

    public void demonstrate(Animal animal) {
        animal.makeSound();
        animal.move();
    }
}
