package practice_5.task_3_menu;

public class Menu {
    //Реализовано без списков, поэтому метод имитирует добавление блюда
    public void presentDish(Dish dish) {
        System.out.println("В меню есть блюдо: " + dish.getName());
    }

    public void showDescription(Dish dish) {
        dish.print();
    }
}
