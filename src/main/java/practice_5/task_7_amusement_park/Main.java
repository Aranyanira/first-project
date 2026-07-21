package practice_5.task_7_amusement_park;

/*
Условие:
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
Примеры:
Американские горки — проверка безопасности
Карусель — техническое обслуживание
Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.
 */
public class Main {
    public static void main(String[] args) {
        Attraction carousel = new Carousel("Спокойный аттракцион");
        Attraction rollerCoaster = new RollerCoaster("Острые ощущения");

        AmusementPark amusementPark = new AmusementPark();
        amusementPark.operateAttraction(carousel);
        amusementPark.operateAttraction(rollerCoaster);


    }
}
