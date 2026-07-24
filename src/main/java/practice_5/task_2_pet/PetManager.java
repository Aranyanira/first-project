package practice_5.task_2_pet;

import practice_5.task_1_zoo.Animal;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Домашнее животное добавлено!");
    }
    public void interact(Pet pet) {
        pet.behave();
        pet.feed();
    }
}
