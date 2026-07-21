package practice_5.task_5_farm;

public class Chicken implements InteractableFarmAnimal {
    @Override
    public void product() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void feed() {
        System.out.println("Курица требует зерно");
    }

    @Override
    public void care() {
        System.out.println("Курица нуждается в кормушке");
    }
}
