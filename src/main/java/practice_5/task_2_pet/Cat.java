package practice_5.task_2_pet;

import practice_5.task_1_zoo.Animal;

public class Cat extends Pet {
    /*
    public Cat(String name) {
        super(name);
    }

     */

    @Override
    public void behave() {
        System.out.println("Кошка играет");
    }

    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм");
    }
}
