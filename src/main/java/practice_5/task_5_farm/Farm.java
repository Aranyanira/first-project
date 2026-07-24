package practice_5.task_5_farm;

public class Farm {
    private InteractableFarmAnimal animal;

    public void setAnimal(InteractableFarmAnimal animal) {
        this.animal = animal;
        System.out.println("Животное было добавлено!");
    }

    public void serviceAnimal (InteractableFarmAnimal animal){
        animal.product();
        animal.feed();
        animal.care();
    }
}
