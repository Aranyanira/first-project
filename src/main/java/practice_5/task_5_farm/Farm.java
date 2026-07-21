package practice_5.task_5_farm;

public class Farm {
    public void serviceAnimal (InteractableFarmAnimal animal){
        animal.product();
        animal.feed();
        animal.care();
    }
}
