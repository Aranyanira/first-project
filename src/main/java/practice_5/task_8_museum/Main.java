package practice_5.task_8_museum;
/*
Условие:
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.
Примеры:
Манускрипт — требует контролируемой влажности
Скульптура — нуждается в реставрации
Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
 */

public class Main {
    public static void main(String[] args) {
        ExhibitActions manuscript = new Manuscript();
        ExhibitActions sculpture = new Sculpture();

        Museum museum = new Museum();

        museum.showExhibit(manuscript);
        museum.showExhibit(sculpture);

    }
}
