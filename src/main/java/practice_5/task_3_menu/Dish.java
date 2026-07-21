package practice_5.task_3_menu;

public class Dish implements Printable {
    private String name;
    private String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("Блюдо: " + this.name + ". Описание: " + this.description);
    }
}
