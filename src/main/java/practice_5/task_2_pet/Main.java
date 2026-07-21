package practice_5.task_2_pet;

/*
Условие:
В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
Примеры:
Собака гуляет и ест сухой корм
Кошка играет и ест влажный корм
Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.
 */

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();

        PetManager petManager = new PetManager();
        petManager.interact(dog);
        petManager.interact(cat);
    }
}
