package practice_5.task_2_pet;

import practice_5.task_1_zoo.Animal;

public class Dog extends Pet {

    @Override
    public void behave() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void feed() {
        System.out.println("Собака ест сухой корм");
    }
}
