package practice_5.task_7_amusement_park;

import java.io.Serializable;

public class Carousel extends Attraction {
    public Carousel(String description) {
        super(description);
    }

    @Override
    public void maintain() {
        System.out.println("Карусель требует технического обслуживания");
    }
}
