package practice_5.task_8_museum;

public class Sculpture implements ExhibitActions {
    @Override
    public void describe() {
        System.out.println("Скульптура - это скульптурный объект");
    }

    @Override
    public void preserve() {
        System.out.println("Скульптура нуждается в реставрации");
    }
}
