package practice_5.task_3_menu;

/*
Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.
 */
public class Main {
    public static void main(String[] args) {
        Dish hotDish = new HotDish("Веганская лазанья", "Лазанья из свежих овощей");
        Dish drink = new Drink("Черный чай", "Черный чай хунбао из провинции Ханчжоу");

        Menu menu = new Menu();

        menu.presentDish(hotDish);
        menu.showDescription(hotDish);
        menu.presentDish(drink);
        menu.showDescription(drink);


    }
}
