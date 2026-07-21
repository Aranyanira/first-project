package practice_5.task_7_amusement_park;

public class Attraction implements Maintainable {
    private String description;


    public Attraction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String info (String description) {
        return description;
    }
    @Override
    public void maintain() {
        System.out.println("Мы не знаем, что это за аттракцион. Если бы мы знали, что это за аттракцион, мы не знаем, что это за аттракцион.");
    }
}

