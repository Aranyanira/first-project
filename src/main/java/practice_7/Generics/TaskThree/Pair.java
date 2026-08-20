package practice_7.Generics.TaskThree;

public class Pair <T, O> {
    private T firstValue;
    private O secondValue;

    public Pair(T firstValue, O secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public O getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(O secondValue) {
        this.secondValue = secondValue;
    }
}
