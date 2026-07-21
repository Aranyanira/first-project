package practice_5.task_4_aquarium;

/*
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.
Примеры:
Акула плавает быстро и агрессивно
Морская звезда медленно ползает
Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.
 */
//Добавление существа не реализовано, поскольку связано со списками
public class Main {
    public static void main(String[] args) {
        Swimmable shark = new Shark ();
        Swimmable seaStar = new SeaStar ();

        Aquarium aquarium = new Aquarium();
        aquarium.demonstrate(shark);
        aquarium.demonstrate(seaStar);
    }
}
