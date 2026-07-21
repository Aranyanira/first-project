package practice_5.task_8_museum;

public class Manuscript implements ExhibitActions {
    @Override
    public void describe() {
        System.out.println("Манусткрипт - это древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("Манускрипт требует контролируемой влажности");
    }
}
