package practice_5.task_4_aquarium;

public class Aquarium {
    private Swimmable swimmable;

    public void setCreature(Swimmable swimmable) {
        this.swimmable = swimmable;
        System.out.println("Морское создание было добавлено.");
    }

    public void demonstrate(Swimmable swimmable) {
        swimmable.swim();
    }
}
