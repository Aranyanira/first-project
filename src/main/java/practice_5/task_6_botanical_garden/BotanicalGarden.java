package practice_5.task_6_botanical_garden;

public class BotanicalGarden {
    private CareablePlant plant;

    public void setPlant(CareablePlant plant) {
        this.plant = plant;
        System.out.println("Растение добавлено.");
    }

    public void maintainPlant (CareablePlant plant) {
        plant.care();
    }
}
