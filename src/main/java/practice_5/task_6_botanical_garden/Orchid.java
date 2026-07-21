package practice_5.task_6_botanical_garden;

public class Orchid implements CareablePlant {
    @Override
    public void care() {
        System.out.println("Орхидея требует высокой влажности и тени");
    }
}
