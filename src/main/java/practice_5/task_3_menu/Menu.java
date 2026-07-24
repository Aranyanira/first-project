package practice_5.task_3_menu;

public class Menu {

    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Блюдо добавлено в меню.");
    }
    public void showDescription(Dish dish) {
        dish.print();
    }
}
