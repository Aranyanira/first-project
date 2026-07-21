package practice_5.task_6_botanical_garden;

/*
Условие:
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.
Примеры:
Орхидея — высокая влажность и тень
Кактус — много света, редкий полив
Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
 */

//Добавить растение опускаем

public class Main {
    public static void main(String[] args) {
        CareablePlant cactus = new Cactus();
        CareablePlant orchid = new Orchid();

        BotanicalGarden botanicalGarden = new BotanicalGarden();
        botanicalGarden.maintainPlant (cactus);
        botanicalGarden.maintainPlant (orchid);

    }
}
