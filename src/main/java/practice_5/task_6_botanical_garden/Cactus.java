package practice_5.task_6_botanical_garden;

public class Cactus implements CareablePlant {
    @Override
    public void care() {
        System.out.println("Кактус требует много света и редкий полив");
    }
}
