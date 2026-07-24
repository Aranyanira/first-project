package practice_5.task_3_menu;

public class Drink extends Dish {

    private final int volume;
    public int getVolume() {
        return volume;
    }
    public Drink(String name, String description) {
        super(name, description);
        this.volume = 400;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Объем: " + this.volume);
    }
}
