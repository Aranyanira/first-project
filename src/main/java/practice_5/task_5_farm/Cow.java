package practice_5.task_5_farm;

public class Cow implements InteractableFarmAnimal {
    @Override
    public void product() {
        System.out.println("Корова дает молоко");;
    }

    @Override
    public void feed() {
        System.out.println("Корова ест сено");;
    }

    @Override
    public void care() {
        System.out.println("Корова нуждается в выпасе");;
    }
}
