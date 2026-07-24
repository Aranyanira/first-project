package practice_5.task_7_amusement_park;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Аттракцион построен.");
    }
    public void operateAttraction(Attraction attraction) {
        attraction.maintain();
    }
}
