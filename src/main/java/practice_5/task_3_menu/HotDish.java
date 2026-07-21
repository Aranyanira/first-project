package practice_5.task_3_menu;

import practice_5.task_3_menu.Dish;

public class HotDish extends Dish {

    private final double temperature;

    public double getTemperature() {
        return temperature;
    }

    public HotDish(String name, String description) {
        super(name, description);
        this.temperature = 40;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Температура: " + this.temperature);
    }
}
