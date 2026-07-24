package practice_5.task_8_museum;

public class Museum {

    private ExhibitActions exhibit;

    public void setExhibit(ExhibitActions exhibit) {
        this.exhibit = exhibit;
        System.out.println("Зарегистрирован новый экспонат.");
    }
    public void showExhibit(ExhibitActions exhibitActions) {
        exhibitActions.describe();
        exhibitActions.preserve();
    }
}
