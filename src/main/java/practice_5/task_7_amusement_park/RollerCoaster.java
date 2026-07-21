package practice_5.task_7_amusement_park;

public class RollerCoaster extends Attraction {
    public RollerCoaster(String description) {
        super(description);
    }

    @Override
    public void maintain() {
        System.out.println("Американские горки требуют проверки безопасности");
    }
}
